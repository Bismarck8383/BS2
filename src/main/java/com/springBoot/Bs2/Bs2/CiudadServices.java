package com.springBoot.Bs2.Bs2;

import org.springframework.stereotype.Service;

import java.util.List;

public interface CiudadServices {

    List<Ciudad> getCiudades();

    Ciudad addCiudad(Ciudad ciudad);

    @Service
    public interface CiudadServicios {
        List<Ciudad> getCiudades();
        Ciudad addCiudad(Ciudad ciudad);

    }
}
