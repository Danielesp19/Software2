/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo12noDIP;

import ejemplo12noDIP.ServicioDeCorreo;

/**
 *
 * @author Usuario
 */
public class User {
    private String nombre;
    private String identificacion;
    private ServicioDeCorreo ServicioDeCorreo= new ServicioDeCorreo();

    public User() {
    }
    
    
    
    public void enviarNotificaciom(){
    ServicioDeCorreo.enviar();
}
}
