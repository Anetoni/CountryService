package com.nordea.aho.service;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nordea.aho.model.Countries;
import com.nordea.aho.model.Data;

/*
 * Contains the logic behind the REST API
 */

@Service
public class CountryService {

    /**
     * Retrieves a list of all countries' names and iso2 codes
     * and containing the list in a Countries object.
     * @return List of type Data containing all countries' information.
     * @throws IOException
     */
    public Countries getCountries() throws IOException {
        URL url = new URL("https://countriesnow.space/api/v0.1/countries/iso");
        ObjectMapper mapper = new ObjectMapper();
        Countries countries = mapper.readValue(url, Countries.class);
        
        return countries;
    }

    /**
     * Retrieves data of specified country, including its name, currency, unicodeflag, flag url and dialcode.
     * @param name name of specified country e.g. "Finland"
     * @return Data object containing specified country's data.
     * @throws StreamReadException
     * @throws DatabindException
     * @throws IOException
     */
    public Data getCountry(String name) throws StreamReadException, DatabindException, IOException {
        URL url = new URL("https://countriesnow.space/api/v0.1/countries/info?returns=currency,flag,unicodeFlag,dialCode");
        ObjectMapper mapper = new ObjectMapper();
        
        Countries countries = mapper.readValue(url, Countries.class);
        List<Data> countryList = countries.getData();
        for(Data country : countryList) {
            if(name.equals(country.getName())) {
                return country;
            }
        }
        return null;
    }
}
