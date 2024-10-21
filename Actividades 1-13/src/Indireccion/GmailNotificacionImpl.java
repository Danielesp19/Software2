/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indireccion;

/**
 *
 * @author Usuario
 */
public class GmailNotificacionImpl implements IServicioNotificacion {
    @Override
    public Correo crearCorreo(Usuario usuario) {
        return new Correo(usuario.getNombre() + " creo un Gmail.");
    }

    @Override
    public void enviar(Correo correo) {
        System.out.println("Enviando Gmail: " + correo.getContenido());
    }
}
