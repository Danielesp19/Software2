/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Usuario
 */
public class SistemaEnvioFedex {
    private IProcesarOrdenFedex procesarOrden;

    public SistemaEnvioFedex(IProcesarOrdenFedex procesarOrden) {
        this.procesarOrden = procesarOrden;
    }
    
    public void enviarOrden(Orden orden){
        procesarOrden.enviarOrdenFedex(orden);
    }
}
