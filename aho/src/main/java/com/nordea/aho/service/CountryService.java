package com.nordea.aho.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nordea.aho.model.Country;

/*
 * Contains the logic behind the REST API
 */

@Service
public class CountryService {
    
    private ArrayList<Country> countries;

    public CountryService() {
        countries = new ArrayList<Country>();

    
    }

    public Country getCountry(String name) {
        for (Country country : countries) {
            if(name.equals(country.getCountry())) {
                return country;
            }
        }
        return null;
    }
}
