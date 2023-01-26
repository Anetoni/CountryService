package com.nordea.aho.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * This class is used to handle information fetched from external sources
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    
    private String country;    
    private String code;
    private String capital;
    private String population;
    private String flag_file_url;

    public Country() {
        
    }

    public Country(String country, String code, String capital, String population, String flag_file_url) {
        this.country = country;
        this.code = code;
        this.capital = capital;
        this.population = population;
        this.flag_file_url = flag_file_url;
    }

    public String getFlag_file_url() {
        return flag_file_url;
    }

    public void setFlag_file_url(String flag_file_url) {
        this.flag_file_url = flag_file_url;
    }

   

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}