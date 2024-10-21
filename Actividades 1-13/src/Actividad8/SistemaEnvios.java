/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class SistemaEnvios {
    private IServicioEmail ServicioEmail;

    public SistemaEnvios(IServicioEmail ServicioEmail) {
        this.ServicioEmail = ServicioEmail;
    }
    
    public void enviar(Email e){
        ServicioEmail.send(e);
    }
}
