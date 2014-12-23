package com.williamsbdev;

import java.util.UUID;

public class Shift {
    private static final String DEFAULT_NAME = "default";
    private static final Integer DEFAULT_HOURS = 8;
    private String id;
    private String name;
    private Integer hours;

    public static Shift createDefault() {
        return new Shift(DEFAULT_NAME, DEFAULT_HOURS);
    }

    public Shift(String name, Integer hours) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.hours = hours;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
