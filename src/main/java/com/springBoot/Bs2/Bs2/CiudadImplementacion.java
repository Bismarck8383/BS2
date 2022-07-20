package com.springBoot.Bs2.Bs2;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadImplementacion implements CiudadServices{
    List<Ciudad> ciudadList = new ArrayList<>();

    @Override
    public List<Ciudad> getCiudades() {
        return ciudadList;
    }

    @Override
    public Ciudad addCiudad(Ciudad ciudad) {
        ciudadList.add(ciudad);
        return ciudad;
    }
}