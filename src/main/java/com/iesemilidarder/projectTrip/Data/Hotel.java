package com.iesemilidarder.projectTrip.Data;



public class Hotel extends Product {
    private String valoracion;
    /* En servicios quiero meter 3 (piscina, tenis, spa) */
    private String Servicios;



    public String getServicios() {
        return Servicios;
    }

    public void setServicios(String servicios) {
        Servicios = servicios;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }


}
