package org.ieszaidinvergeles.dam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConexion {
    public static void conexion(){

        System.out.println("iniciando configuracion de hibernate");
        final StandardServiceRegistry registro = new StandardServiceRegistryBuilder().configure().build();
        final SessionFactory factory = new MetadataSources(registro).buildMetadata().buildSessionFactory();
        System.out.println("abriendo conexion BDD");
        Session session = factory.openSession();
        System.out.println("consexion abierta");
        System.out.println("cerrando conexion BDD");
        session.close();
        System.out.println("conexion cerrada");
    }

}
