package com.example.demo.model;

public class Country {
    private Integer id = null;
    private String name = null;
    public static Integer autoincrementId = 0;

    Country(){

    }
    public Country(String name){
        Country.autoincrementId++;
        this.id = Country.autoincrementId;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}