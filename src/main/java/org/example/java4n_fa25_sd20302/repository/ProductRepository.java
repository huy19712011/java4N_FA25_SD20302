package org.example.java4n_fa25_sd20302.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.java4n_fa25_sd20302.entity.Product;

import java.util.List;

public class ProductRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();

    public List<Product> getProducts() {

        return em.createQuery("select p from Product p", Product.class).getResultList();
    }
}
