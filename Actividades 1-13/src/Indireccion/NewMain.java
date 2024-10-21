/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Indireccion;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Usando una fábrica o lógica de configuración para crear usuarios
        IServicioNotificacion servicioGmail = new GmailNotificacionImpl();
        IServicioNotificacion servicioOutlook = new OutlookNotificacionImpl();

        Usuario u1 = new Usuario("Daniel", servicioGmail);
        u1.generarCorreo();
        
        Usuario u2 = new Usuario("Felipe", servicioOutlook);
        u2.generarCorreo();    
    }
    
}
