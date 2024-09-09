/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplo11DIP;

/**
 *
 * @author Usuario
 */
public class ServicioDeNotificacionesImpl implements IServicioDeNotificacion{

    @Override
    public void notificar() {
        System.out.println("estoy enviando el correo");
    }
    
}
