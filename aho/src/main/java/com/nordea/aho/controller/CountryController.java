package com.nordea.aho.controller;


import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.nordea.aho.model.Countries;
import com.nordea.aho.model.Data;
import com.nordea.aho.service.CountryService;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/*
 * Responsible for processing HTTP Requests
 * Retrieves information through CountryService.
 */

@RestController
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
    
    //Retrieves information of all countries through CountryService.
    @GetMapping("/countries")
    public Countries getCountries() throws IOException {
        return countryService.getCountries();
    }

    //Retrieves information of specified country through CountryService.
    @GetMapping("/countries/{name}")
    public Data getCountry(@PathVariable("name")String name) throws StreamReadException, DatabindException, IOException {
        return countryService.getCountry(name);
    }
}