package org.ieszaidinvergeles.dam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        HibernateConexion.conexion();
        //HibernateInsercion.insertar();

        /*final StandardServiceRegistry registro = new StandardServiceRegistryBuilder().configure().build();
        final SessionFactory factory = new MetadataSources(registro).buildMetadata().buildSessionFactory();
        Session session = factory.openSession();*/
    }
}