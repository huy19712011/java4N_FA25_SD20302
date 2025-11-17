package org.example.java4n_fa25_sd20302.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.java4n_fa25_sd20302.entity.Category;

import java.util.List;

public class CategoryRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    private EntityManager em = emf.createEntityManager();

    public List<Category> getCategories() {

        return em.createQuery("select c from Category c", Category.class).getResultList();
    }

    public Category getCategoryById(Long categoryId) {

        return em.find(Category.class, categoryId);
    }
}
