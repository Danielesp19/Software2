/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Indireccion;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String nombre;
    private IServicioNotificacion servicioNotificacion;

    public Usuario(String nombre, IServicioNotificacion servicioNotificacion) {
        this.nombre = nombre;
        this.servicioNotificacion = servicioNotificacion;
    }

    public void generarCorreo() {
        Correo correo = servicioNotificacion.crearCorreo(this);
        servicioNotificacion.enviar(correo);
    }

    public String getNombre() {
        return nombre;
    }


}