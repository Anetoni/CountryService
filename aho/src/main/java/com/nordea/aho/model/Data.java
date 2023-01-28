package com.nordea.aho.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/*
 * This class stores values fetched from the external source.
 * Represents a singular country
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"name", "iso2", "currency"})
public class Data {
    @JsonProperty("name")
    private String name;
    @JsonProperty("Iso2")
    private String iso2;
    @JsonProperty("capital")
    private String capital;
    @JsonProperty("populationCounts")
    private String population;
    @JsonProperty("flag")
    private String flag_file_url;
    private String currency;
    private String dialCode;
    private String unicodeFlag;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso2() {
        return iso2;
    }

    public void setIso2(String country_code) {
        this.iso2 = country_code;
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

    public String getFlag_file_url() {
        return flag_file_url;
    }

    public void setFlag_file_url(String flag_file_url) {
        this.flag_file_url = flag_file_url;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDialCode() {
        return dialCode;
    }

    public void setDialCode(String dialCode) {
        this.dialCode = dialCode;
    }

    public String getUnicodeFlag() {
        return unicodeFlag;
    }

    public void setUnicodeFlag(String unicodeFlag) {
        this.unicodeFlag = unicodeFlag;
    }
}