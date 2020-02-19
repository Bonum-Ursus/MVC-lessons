package org.ursus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.TreeMap;

public class Person {
    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    private TreeMap<String, String> countryMap;

    public Person() {
        countryMap = new TreeMap<>();
        countryMap.put("RU","Russia");
        countryMap.put("DE","Germany");
        countryMap.put("US","USA");
        countryMap.put("IL","Italy");
        countryMap.put("SP","Spain");
        countryMap.put("UK","United Kingdom");
    }

    public TreeMap<String, String> getCountryMap() {
        return countryMap;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
