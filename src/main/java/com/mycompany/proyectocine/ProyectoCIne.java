/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectocine;

import com.cine.entidades.Actor;
import com.cine.manager.ManagerActor;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author luisr
 */
public class ProyectoCine {
    public static void main(String[] args) {
        try {
            ManagerActor managerActor = new ManagerActor();
            Actor objActor = new Actor();
            objActor.setId(new BigDecimal(1));
            objActor.setApellido("Cardenas");
            objActor.setNombre("Andres");
            objActor.setPais("Ecuador");
            managerActor.insertarAutor(objActor);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(ProyectoCine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
