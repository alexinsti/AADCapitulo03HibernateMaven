package org.ieszaidinvergeles.dam.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String nombre;
    @Column(length = 3)
    private int edad;
    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;
    @ManyToOne
    Empresa empresa;
    @ManyToMany(cascade= {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name="persona_deporte",
            joinColumns = @JoinColumn(name="persona_id"),
            inverseJoinColumns = @JoinColumn(name="deporte_id")
    )
    private Set<Deporte> deportes = new HashSet<>();
    public Persona() {
    }

    public Persona(int id, String nombre, int edad, LocalDate fechaNacimiento) {
        this(nombre, edad, fechaNacimiento);
        this.id = id;
    }

    public Persona(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Set<Deporte> getDeportes() {
        return deportes;
    }

    public void setDeportes(Set<Deporte> deportes) {
        this.deportes = deportes;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
