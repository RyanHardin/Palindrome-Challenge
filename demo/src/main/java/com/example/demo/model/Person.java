package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private final int count;
    private final String name;


    public Person(@JsonProperty("count") int count,
                  @JsonProperty("name") String name) {
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }
}
