package com.dane.demo.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dane.demo.model.Persona;
import com.dane.demo.service.PersonaService;

public class PersonaRepositoryImplement implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona newPerson (Persona newPerson) {
        return personaRepository.save(newPerson);
    }

    @Override
    public Iterable<Persona> getAll() {
        return this.personaRepository.findAll();
    }

    @Override
	public Persona modifyPerson(Persona persona) {
		
		Optional<Persona> personaEncontrada = this.personaRepository.findById(persona.getNumDoc());
        if(personaEncontrada.get() != null){
            personaEncontrada.get().setNombre(persona.getNombre());
            personaEncontrada.get().setApellido(persona.getApellido());
            personaEncontrada.get().setEmail(persona.getEmail());
            return this.newPerson(personaEncontrada.get());
        }
        return null;
	}

	@Override
	public Boolean deletePerson(Long idPersona) {
		this.personaRepository.deleteById(idPersona);
		return true;
	}
    
}
