/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpah.data.repository;

import com.jpah.data.model.Categories;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Leanghour
 */
@Repository
@Transactional
public class CategoryRepository {
    @PersistenceContext
    private EntityManager entityManager;
    
    public void saveCategory(Categories category)
    {
        entityManager.persist(category);
    }
}
