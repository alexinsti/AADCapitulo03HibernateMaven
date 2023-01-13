package org.ieszaidinvergeles.dam.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="deportes")
public class Deporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private boolean aireLibre;
    @ManyToMany(cascade= {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name="persona_deporte",
            joinColumns = @JoinColumn(name="deporte_id"),
            inverseJoinColumns = @JoinColumn(name="persona_id")
    )
    private Set<Persona> personas = new HashSet<>();

    public Deporte() {
    }

    public Deporte(int id, String nombre, boolean aireLibre) {
        this.id = id;
        this.nombre = nombre;
        this.aireLibre = aireLibre;
    }

    public Deporte(String nombre, boolean aireLibre) {
        this.nombre = nombre;
        this.aireLibre = aireLibre;
    }

    public Deporte(String nombre, boolean aireLibre, Set<Persona> personas) {
        this.nombre = nombre;
        this.aireLibre = aireLibre;
        this.personas = personas;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAireLibre() {
        return aireLibre;
    }

    public void setAireLibre(boolean aireLibre) {
        this.aireLibre = aireLibre;
    }

    public Set<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(Set<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Deporte{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", aireLibre=" + aireLibre +
                '}';
    }
}
