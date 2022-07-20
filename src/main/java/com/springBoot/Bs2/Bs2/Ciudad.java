package com.springBoot.Bs2.Bs2;

public class Ciudad {
    private String nombre;
    private Integer populacion;

    public Ciudad() {
        this.nombre = null;
        this.populacion = null;
    }

    public Ciudad(String nombre, Integer populacion) {
        this.nombre = nombre;
        this.populacion = populacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPopulacion() {
        return populacion;
    }

    public void setPopulacion(Integer population) {
        this.populacion = populacion;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "name='" + nombre + '\'' +
                ", populacion=" + populacion +
                '}';
    }
}
