package com.example.homework073;

public class User {
    private String nameCountry;
    private int photo;

    public String getNameCountry() {
        return nameCountry;
    }

    public int getPhoto() {
        return photo;
    }

    public String getNameCity() {
        return nameCity;
    }

    public User(String nameCountry, int photo, String nameCity) {
        this.nameCountry = nameCountry;
        this.photo = photo;
        this.nameCity = nameCity;
    }

    private String nameCity;
}
