/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cine.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author luisr
 */
public class ManagerDAOCine {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ManagerDAOCine() {
     crearEntityManager();
    }
    
    private EntityManager crearEntityManager()
    {
        emf = Persistence.createEntityManagerFactory("CinePu");//nombre de la persistencia a utilizar
        em = emf.createEntityManager();
    return em;
    }
    
        public void insertar(Object pObjeto) throws Exception {
		if (pObjeto == null)
			throw new Exception("No se puede insertar un objeto null.");
		try {
                    EntityManager em = crearEntityManager();
                    EntityTransaction etx = em.getTransaction();
                        etx.begin();
                        em.persist(pObjeto);
                        etx.commit();
                        System.out.println("INSERTO...!!!!");
		} catch (Exception e) {
			throw new Exception("No se pudo insertar el objeto especificado: " + e.getMessage());
		}

	}
}
