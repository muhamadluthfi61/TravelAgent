package com.example.demo;

public enum SeatClasses {
    Economy("Economy"), Business("Business"), FirstClass("First Class");
    private String value;

    private SeatClasses(String value)
    {
        this.value=value;
    }

    public String getValue()
    {
        return value;
    }
}
