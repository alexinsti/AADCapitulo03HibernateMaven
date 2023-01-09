package org.ieszaidinvergeles.dam.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

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

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
