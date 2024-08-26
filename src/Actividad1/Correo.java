/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

import Actividad1.visual.Notificable;

/**
 *
 * @author Usuario
 */
public class Correo implements Notificable {
    public Correo() {
    }
    @Override
    public String notificar(String destinatario,String de, String mensaje) {
        
        return("Enviando correo     "+de+"   a   " + destinatario + "   : " + mensaje);
    }

    
    
}
