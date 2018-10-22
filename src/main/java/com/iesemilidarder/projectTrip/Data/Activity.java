package com.iesemilidarder.projectTrip.Data;

public class Activity extends Product {
    /* En tipo quiero meter 3 (playa, montaña, Caminos) */
    private String Tipo;
    private String Esfuerzo;

    public String getEsfuerzo() {
        return Esfuerzo;
    }

    public void setEsfuerzo(String esfuerzo) {
        Esfuerzo = esfuerzo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

}
