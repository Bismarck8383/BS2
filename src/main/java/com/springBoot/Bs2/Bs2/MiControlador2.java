package com.springBoot.Bs2.Bs2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MiControlador2 {
    @Autowired
    @Qualifier("standardBean")
    PersonaServices personService;

    @Autowired
    CiudadServices cityService;

    @GetMapping("/controller2/getPerson")
    PersonaServices addPerson (){
        personService.setEdad(personService.getEdad()*2);
        return personService;
    }
    @GetMapping("/controller2/getCities")
    List<Ciudad> getCiudades(){
        return cityService.getCiudades();
    }
}
