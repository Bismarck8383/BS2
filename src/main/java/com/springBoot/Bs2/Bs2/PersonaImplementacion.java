package com.springBoot.Bs2.Bs2;

import org.springframework.stereotype.Service;

@Service
public class PersonaImplementacion implements PersonaServices {
    Persona persona = new Persona("",null,"");

    @Override
    public String getNombre() {
        return persona.getNombre();
    }

    @Override
    public String getCiudad() {
        return persona.getCiudad();
    }

    @Override
    public Integer getEdad() {
        return persona.getEdad();
    }

    @Override
    public void setNombre(String nombre) {
        persona.setNombre(nombre);
    }

    @Override
    public void setCiudad(String ciudad) {
        persona.setCiudad(ciudad);
    }

    @Override
    public void setEdad(Integer edad) {persona.setEdad(edad);
    }
}