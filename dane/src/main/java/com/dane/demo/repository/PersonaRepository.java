package com.dane.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dane.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
