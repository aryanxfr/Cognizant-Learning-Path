package com.cognizant.spring_learn.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(SecurityConfig.class);

    @Bean
    public PasswordEncoder passwordEncoder() {
        LOGGER.info("Start PasswordEncoder");
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .httpBasic()
                .and()
                .authorizeHttpRequests()
                .requestMatchers("/countries").hasRole("USER")
                .requestMatchers("/authenticate").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated();

        return http.build();
    }


    @Bean
    public org.springframework.security.core.userdetails.UserDetailsService userDetailsService(PasswordEncoder encoder) {
        var uds = new org.springframework.security.provisioning.InMemoryUserDetailsManager();

        var user = org.springframework.security.core.userdetails.User
                .withUsername("user")
                .password(encoder.encode("pwd"))
                .roles("USER")
                .build();

        var admin = org.springframework.security.core.userdetails.User
                .withUsername("admin")
                .password(encoder.encode("pwd"))
                .roles("ADMIN")
                .build();

        uds.createUser(user);
        uds.createUser(admin);

        return uds;
    }
}
