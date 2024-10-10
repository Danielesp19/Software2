/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Indireccion;

/**
 *
 * @author Usuario
 */
public interface IServicioNotificacion {
    Correo crearCorreo(Usuario usuario);
    void enviar(Correo correo);
}
