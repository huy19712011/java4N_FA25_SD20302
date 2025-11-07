package org.example.java4n_fa25_sd20302.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.java4n_fa25_sd20302.entity.Student;

import java.util.List;

public class StudentRepository {

        private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        private EntityManager em = emf.createEntityManager();

        public List<Student> getStudents() {

            return em.createQuery("select s from Student s", Student.class).getResultList();

    }
}
