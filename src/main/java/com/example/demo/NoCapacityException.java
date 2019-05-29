package com.example.demo;
public class NoCapacityException extends Exception{

    public NoCapacityException()
    {
        super("No more seat available");
    }

    public String getExMessage()
    {
        return super.getMessage();
    }
}
