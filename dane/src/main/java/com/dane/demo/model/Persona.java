package com.dane.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity

public class Persona {
    @Id
    @Column
    private Long numDoc;
    
    @Column
    private String nombre;
    
    @Column
    private String apellido;
    
    @Column
    private String email;

}
