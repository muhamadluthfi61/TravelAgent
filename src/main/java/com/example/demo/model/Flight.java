package com.example.demo.model;

import com.example.demo.NoCapacityException;
import com.example.demo.Schedule;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flight {

    @Id
    private String number;
    private String airline;
    private int capacity;
    private int economyCapacity;
    private int businessCapacity;
    private int firstClassCapacity;
    private int economyPrice;
    private int businessPrice;
    private int firstClassPrice;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        this.capacity = economyCapacity+businessCapacity+firstClassCapacity;
    }

    public int getEconomyCapacity() {
        return economyCapacity;
    }

    public void setEconomyCapacity(int economyCapacity) throws NoCapacityException {
        if(economyCapacity<0)
        {
            throw new NoCapacityException();
        }
        this.economyCapacity = economyCapacity;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) throws NoCapacityException {
        if(businessCapacity<0)
        {
            throw new NoCapacityException();
        }this.businessCapacity = businessCapacity;
    }

    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(int firstClassCapacity) throws NoCapacityException {
        if(firstClassCapacity<0)
        {
            throw new NoCapacityException();
        }this.firstClassCapacity = firstClassCapacity;
    }

    public int getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(int economyPrice) {
        this.economyPrice = economyPrice;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getFirstClassPrice() {
        return firstClassPrice;
    }

    public void setFirstClassPrice(int firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

}
