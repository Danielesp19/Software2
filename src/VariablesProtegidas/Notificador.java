/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VariablesProtegidas;

/**
 *
 * @author Usuario
 */
public class Notificador {
    private INotificable canal;

    public Notificador(INotificable canal) {
        this.canal = canal;
    }
    public void enviarNotificacion(Notificacion notificacion){
        canal.notificar(notificacion);
    }
}
