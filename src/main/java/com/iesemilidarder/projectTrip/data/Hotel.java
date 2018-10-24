package com.iesemilidarder.projectTrip.data;



public class Hotel extends Product {
    private String valoration;
    /* En servicios quiero meter 3 (piscina, tenis, spa) */
    public enum Servicios {
        Spa, Piscina, Tenis}

    public String getValoration() {
        return valoration;
    }

    public void setValoration(String valoration) {
        this.valoration = valoration;
    }


}
