/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cine.manager;

import com.cine.DAO.ManagerDAOCine;
import com.cine.entidades.Actor;

/**
 *
 * @author luisr
 */
public class ManagerActor {
    ManagerDAOCine managerDAOCine = new ManagerDAOCine();
    public void insertarAutor( Actor objActor ) throws Exception
    {
        managerDAOCine.insertar(objActor);
    }
}
