/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariablesProtegidas;

/**
 *
 * @author Usuario
 */
public class Whatsapp implements INotificable{

    @Override
    public void notificar(Notificacion notificacion) {
        System.out.println("whatsApp: " + notificacion.getTitulo()+" "+ notificacion.getTexto());
    }
    
}
