package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);
    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("Countries: {}", countries);
        LOGGER.info("END");
        return countries;
    }
}
