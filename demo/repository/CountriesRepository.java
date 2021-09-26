package com.example.demo.repository;
import com.example.demo.model.Country;
import java.util.ArrayList;

public class CountriesRepository {

    ArrayList<Country> countries = new ArrayList<>();

    public CountriesRepository() {
    }

    public String create(String countryName) {
        Country country = new Country(countryName);
        this.countries.add(country);
        return "Country created";
    }

    public String read(Integer id) {
        try {
            Country country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return country.toString();
        } catch (Exception exception) {
            return "Not found";
        }
    }

    public String readAll() {
        return this.countries.toString();
    }

    public String update(Integer id, String countryName) {
        try {
            Country country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            country.setName(countryName);
            return "Country updated";
        } catch (Exception exception) {
            return "Country not found";
        }
    }

    public String delete(Integer id) {
        try {
            Country country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if (country == null) {
                return "Country not found";
            }
            this.countries.remove(country);
            return "Country deleted";
        } catch (Exception exception) {
            return "Country not found";
        }

    }
}