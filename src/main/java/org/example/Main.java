package org.example;

import com.tudai.Carrera;
import com.tudai.Estudiante;
import com.tudai.Inscripciones;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.text.html.parser.Entity;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Integrador2");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        /*
        Estudiante e1 = new Estudiante(350147258, "Joaquin","Tobal",30,"Olavarria", "M");
        em.createNativeQuery("INSERT INTO estudiante (dni, nombre, apellido, edad, ciudad, genero) VALUES (?,?,?,?,?,?)")
                .setParameter(1, e1.getDni())
                .setParameter(2, e1.getNombre())
                .setParameter(3, e1.getApellido())
                .setParameter(4, e1.getEdad())
                .setParameter(5, e1.getCiudad())
                .setParameter(6, e1.getGenero())
                .executeUpdate();

         */


        /*
        Carrera c1 = new Carrera("Tecnicatura Universitaria en Desarrollo de Aplicaciones Informáticas");
        em.persist(c1);
        Carrera c2 = new Carrera("Ingeniería de Sistemas");
        em.persist(c2);
        Carrera c3 = new Carrera("Profesorado de Informática");
        em.persist(c3);
        Carrera c4 = new Carrera("Tecnicatura Universitaria en Administración de Redes Informáticas");
        em.persist(c4);

         */
        Estudiante e1 = em.find(Estudiante.class, 1);
        Carrera c1 = em.find(Carrera.class, 1);
        Date fecha = new Date();
        Inscripciones i1 = new Inscripciones(e1,c1,false,new Timestamp(fecha.getTime()));
        em.createNativeQuery("INSERT INTO inscripciones (false, ) VALUES (?,?,?,?,?,?)")
                .setParameter(1, e1.getDni())
                .setParameter(2, e1.getNombre())
                .setParameter(3, e1.getApellido())
                .setParameter(4, e1.getEdad())
                .setParameter(5, e1.getCiudad())
                .setParameter(6, e1.getGenero())
                .executeUpdate();



        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}