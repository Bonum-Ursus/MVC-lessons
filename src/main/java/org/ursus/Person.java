package org.ursus;

import java.util.TreeMap;

public class Person {
    private String firstName;
    private String lastName;
    private String country;
    private TreeMap<String, String> favoriteLanguages;
    private String favoriteLanguage;
    private TreeMap<String, String> countryMap;
    private String OS;
    private TreeMap<String, String> OSmap;

    public Person() {
        countryMap = new TreeMap<>();
        countryMap.put("Russia","Russia");
        countryMap.put("Germany","Germany");
        countryMap.put("USA","USA");
        countryMap.put("Italy","Italy");
        countryMap.put("Spain","Spain");
        countryMap.put("United Kingdom","United Kingdom");
        favoriteLanguages = new TreeMap<>();
        favoriteLanguages.put("Java", "Java");
        favoriteLanguages.put("C#","C#");
        favoriteLanguages.put("Python","Python");
        favoriteLanguages.put("Ruby","Ruby");
        favoriteLanguages.put("C++","C++");
        OSmap = new TreeMap<>();
        OSmap.put("Linux Arch", "Linux Arch");
        OSmap.put("Linux Ubuntu", "Linux Ubuntu");
        OSmap.put("Windows X", "Windows X");
        OSmap.put("Mac OS", "Mac OS");
    }

    public TreeMap<String, String> getOSmap() {
        return OSmap;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public TreeMap<String, String> getFavoriteLanguages() {
        return favoriteLanguages;
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
