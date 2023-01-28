package com.nordea.aho.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/*
 * This class is used to handle information fetched from external sources
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    private List<Data> countries = null;

    public List<Data> getData() {
        return countries;
    }

    public void setData(List<Data> countries) {
        this.countries = countries;
    }
}