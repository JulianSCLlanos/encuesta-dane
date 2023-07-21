package com.dane.demo.controller;

import com.dane.demo.model.Persona;
import com.dane.demo.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping("/nuevo")
    public Persona newPersona(@RequestBody Persona newPersona) {
        return this.personaService.newPerson(newPersona);
    }

    @GetMapping("/mostrar")
    public Iterable<Persona> getAll(){
        return personaService.getAll();
    }

    @PostMapping("/actualizar")
    public Persona updatePerson(@RequestBody Persona persona) {
        return this.personaService.modifyPerson(persona);
    }

    @PostMapping(value = "/{id}")
    public Boolean deletePersona(@PathVariable(value = "id") Long id){
        return this.personaService.deletePerson(id);
    }
}
