package com.iesemilidarder.projectTrip.data;

import java.util.UUID;

public abstract class Product implements Country {
    private String name;
    private Double price;
    private String persons;
    private String enterprise;
    private String id;

    public Product() {
        this.id = UUID.randomUUID().toString();
    }
    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getEnterprise() { return enterprise; }

    public void setEnterprise(String enterprise) { this.enterprise = enterprise; }

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
