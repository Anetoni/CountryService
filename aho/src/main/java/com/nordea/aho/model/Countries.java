package com.nordea.aho.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
 * This class is used to handle information fetched from external sources.
 * Represents multiple countries
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Countries {
    private List<Country> countries = null;

    public List<Country> getData() {
        return countries;
    }

    public void setData(List<Country> countries) {
        this.countries = countries;
    }
}