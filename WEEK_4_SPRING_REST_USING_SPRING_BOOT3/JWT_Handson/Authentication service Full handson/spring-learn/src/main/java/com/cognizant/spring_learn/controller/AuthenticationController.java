package com.cognizant.spring_learn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;


import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {
    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);
    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        logger.info("START: /authenticate");
        logger.debug("Authorization Header: {}", authHeader);

        String user = getUser(authHeader);
        logger.debug("Decoded User: {}", user);
        String token = generateJwt(user);
        logger.debug("Generated Token: {}", token);

        Map<String, String> map = new HashMap<>();
        map.put("token", token);
        logger.info("END: /authenticate");
        return map;
    }
    private String getUser(String authHeader) {
        logger.debug("START: getUser()");
        String encodedCredentials = authHeader.substring("Basic ".length());
        logger.debug("Encoded Credentials: {}", encodedCredentials);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedString = new String(decodedBytes);
        logger.debug("Decoded String: {}", decodedString);
        String user = decodedString.split(":")[0];
        logger.debug("Extracted Username: {}", user);
        logger.debug("END: getUser()");
        return user;
    }
    private String generateJwt(String user) {
        logger.debug("START: generateJwt()");

        Key key = Keys.hmacShaKeyFor("thisIsMyVerySecureKey@1234567890!!".getBytes());

        String token = Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        logger.debug("Generated JWT: {}", token);
        return token;
    }
}
