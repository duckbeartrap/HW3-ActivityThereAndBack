package com.example.william.thereandback;
import java.io.Serializable;

/**
 * Created by william on 3/18/18.
 */

public class Person implements Serializable{

    public Person(String name, String lastName, String monthOfBirth, String season, String favoriteLecture){

        setName(name);
        setLastname(lastName);
        setMonth(monthOfBirth);
        setSeason(season);
        setFavorite(favoriteLecture);

    }

    private String name;
    private String lastName;
    private String monthOfBirth;
    private String season;
    private String favoriteLecture;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastName;
    }
    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public String getMonth() {
        return monthOfBirth;
    }
    public void setMonth(String month) {
        this.monthOfBirth = month;
    }

    public String getSeason() {
        return season;
    }
    public void setSeason(String season) {
        this.season = season;
    }

    public String getFavorite() {
        return favoriteLecture;
    }
    public void setFavorite(String favorite) {
        this.favoriteLecture = favorite;
    }
}
