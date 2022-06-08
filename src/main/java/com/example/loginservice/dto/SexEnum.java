package com.example.loginservice.dto;

public enum SexEnum {
    MALE("male"),
    FEMALE("female");
    private final String value;
    SexEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
