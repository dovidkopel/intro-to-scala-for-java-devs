package com.dovidkopel.java;

import java.util.Optional;

/**
 * Created by dkopel on 1/24/17.
 */
public class Person {
    private String name;

    private Optional<Location> location;

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", location=" + location +
            '}';
    }

    public Person(String name, Optional<Location> location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }
    public Optional<Location> getLocation() {
        return location;
    }
}