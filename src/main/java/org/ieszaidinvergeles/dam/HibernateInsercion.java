package org.ieszaidinvergeles.dam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.ieszaidinvergeles.dam.entities.Persona;

import java.time.LocalDate;

public class HibernateInsercion {
    public static void insertar(){
        System.out.println("iniciando configuracion de hibernate");
        final StandardServiceRegistry registro = new StandardServiceRegistryBuilder().configure().build();
        final SessionFactory factory = new MetadataSources(registro).buildMetadata().buildSessionFactory();
        System.out.println("abriendo conexion BDD");
        Session session = factory.openSession();
        System.out.println("consexion abierta");

        Persona persona = new Persona("Ana", 25, LocalDate.of(2006,2,25));
        session.beginTransaction();
        session.save(persona);


        System.out.println("cerrando conexion BDD");
        session.getTransaction().commit();
        session.close();
        System.out.println("conexion cerrada");


    }
}
