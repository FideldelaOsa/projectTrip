package com.iesemilidarder.projectTrip.data;

public abstract class Product {
    private String name;
    private Double price;
    private String persons;

    public String getPersons() { return persons; }

    public void setPersons(String persons) { this.persons = persons; }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
