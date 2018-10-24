package com.iesemilidarder.projectTrip.data;

public class Flight extends Product{
    private String destination;


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public enum Company {
        Iberia, AirEuropa, Vueling, EasyJet, Eurowings
    }


}
