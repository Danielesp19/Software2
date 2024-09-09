/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Usuario
 */
public class SistemaEnvioUps {
    private IProcesarOrdenUps procesarOrdenUps;
    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenDhl procesarOrdenDhl;

    public SistemaEnvioUps(IProcesarOrdenUps procesarOrdenUps,IProcesarOrdenFedex procesarOrdenFedex,IProcesarOrdenDhl procesarOrdenDhl) {
        this.procesarOrdenUps = procesarOrdenUps;
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenDhl = procesarOrdenDhl;
    }
    
    public void enviarOrdenUps(Orden orden){
        procesarOrdenUps.enviarOrdenUps(orden);
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenDhl(Orden orden){
        procesarOrdenDhl.enviarOrdenDhl(orden);
    }
    
    
            
    
}
