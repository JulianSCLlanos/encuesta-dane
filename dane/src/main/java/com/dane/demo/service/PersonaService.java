package com.dane.demo.service;

import com.dane.demo.model.Persona;

public interface PersonaService {
    Persona newPerson(Persona newPerson);
	Iterable<Persona> getAll();
	Persona modifyPerson(Persona persona);
	Boolean deletePerson(Long idPersona);
}
