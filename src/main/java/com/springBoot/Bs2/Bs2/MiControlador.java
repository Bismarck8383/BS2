package com.springBoot.Bs2.Bs2;


import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController

public class MiControlador {

    @Autowired
    @Qualifier("standardBean")
    PersonaServices personaServicios;

    @Autowired
    @Qualifier("bean1")
    PersonaServices personServiceBean1;

    @Autowired
    @Qualifier("bean2")
    PersonaServices personServiceBean2;

    @Autowired
    @Qualifier("bean3")
    PersonaServices personServiceBean3;

    @Autowired
    CiudadServices cityService;

    @GetMapping("/controller1/addPerson")
    PersonaServices addPersona (@RequestHeader Map<String, String> headers){
        personaServicios.setNombre(headers.get("nombre"));
        personaServicios.setCiudad(headers.get("ciudad"));
        personaServicios.setEdad(Integer.parseInt(headers.get("edad")));

        return personaServicios;
    }

    @PostMapping("/controller1/addCity")
    Ciudad addCiudad (@RequestBody ObjectNode requestObject){
        String ciudadNombre = requestObject.get("ciudadNombre").asText();
        Integer ciudadPopulacion = requestObject.get("ciudadPopulacion").asInt();

        Ciudad newCiudad = new Ciudad(ciudadNombre, ciudadPopulacion);
        cityService.addCiudad(newCiudad);

        return newCiudad;
    }

    @GetMapping("/bean/{bean}")
    PersonaServices chooseBean (@PathVariable String bean){
        PersonaServices whichPersonService;
        switch (bean){
            case "bean1":
                whichPersonService = personServiceBean1;
                break;
            case "bean2":
                whichPersonService = personServiceBean2;
                break;
            case "bean3":
                whichPersonService = personServiceBean3;
                break;
            default:
                whichPersonService = personaServicios;
        }

        return whichPersonService;
    }

}
