/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VariablesProtegidas;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion("actualizacion", "se deben actualizar los drivers");
        
        INotificable correo = new Correo();
        Notificador notificador = new Notificador(correo);
        notificador.enviarNotificacion(notificacion);
        
        
        INotificable sms = new Sms();
        Notificador notificador1 = new Notificador(sms);
        notificador1.enviarNotificacion(notificacion);
        
        
        INotificable whatsapp = new Whatsapp();
        Notificador notificador2 = new Notificador(whatsapp);
        notificador2.enviarNotificacion(notificacion);
    }
    
}
