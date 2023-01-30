package com.nordea.aho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.nordea.aho.model.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.nordea.aho.model.Countries;
import com.nordea.aho.service.CountryService;

@SpringBootTest
class CountryServiceApplicationTests {

	//Should retrieve a list of all countries starting with Afghanistan
	@Test
	void shouldRetrieveCountries() throws Exception {
		CountryService countryService = new CountryService();
		Countries countries = countryService.getCountries();
		List<Data> countryList = countries.getData();
		assertEquals("Afghanistan", countryList.get(0).getName());
	}

	//Should retrieve Finland's information
	@Test
	void shouldRetrieveFinland() throws Exception {
		CountryService countryService = new CountryService();
		Data finland = countryService.getCountry("Finland");
		assertEquals("Finland", finland.getName());
		assertEquals("EUR", finland.getCurrency());
	}
}
