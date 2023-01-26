package com.nordea.aho.controller;

import com.nordea.aho.model.Country;
import com.nordea.aho.service.CountryService;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.resource.HttpResource;

/*
 * Responsible for processing REST API requests
 */

@RestController
public class CountryController {

    private CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public Country getCountry(@RequestParam("name") String name) {
        return countryService.getCountry(name);
    }

}