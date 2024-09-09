/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo11DIP;

import ejemplo12noDIP.ServicioDeCorreo;

/**
 *
 * @author Usuario
 */
public class User {

    private IServicioDeNotificacion ServicioDeNotificaciones;

    public User(IServicioDeNotificacion ServicioDeNotificaciones) {
        this.ServicioDeNotificaciones = ServicioDeNotificaciones;
    }
    
    
    public void enviarNotificaciom(){
    ServicioDeNotificaciones.notificar();
}
}
