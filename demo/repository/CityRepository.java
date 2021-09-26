package com.example.demo.repository;

import com.example.demo.model.City;

import java.util.ArrayList;

public class CityRepository {

    ArrayList<City> cities = new ArrayList<>();

    public CityRepository() {
    }

    public String create(String cityName) {
        City city = new City(cityName);
        this.cities.add(city);
        return "City created";
    }

    public String read(Integer id) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return city.toString();
        } catch (Exception exception) {
            return "Not found";
        }
    }

    public String readAll() {
        return this.cities.toString();
    }

    public String update(Integer id, String cityName) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            city.setName(cityName);
            return "City updated";
        } catch (Exception exception) {
            return "City not found";
        }
    }

    public String delete(Integer id) {
        try {
            City city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if (city == null) {
                return "City not found";
            }
            this.cities.remove(city);
            return "City deleted";
        } catch (Exception exception) {
            return "City not found";
        }
    }
}
