package com.springBoot.Bs2.Bs2;

public interface PersonaServices {
    String getNombre();
    String getCiudad();
    Integer getEdad();
    void setNombre(String nombre);
    void setCiudad(String ciudad);
    void setEdad(Integer edad);
    String toString();
}
