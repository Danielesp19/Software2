/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad7;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IProcesarOrdenUps ups = new UpsImpl();
        IProcesarOrdenFedex fedex = new FedexImpl();
        IProcesarOrdenDhl dhl = new DhlImpl();
        SistemaEnvioUps sistema = new SistemaEnvioUps(ups,fedex,dhl);
        Orden orden= new Orden("manizales", "bogota");
        sistema.enviarOrdenUps(orden);
        sistema.enviarOrdenFedex(orden);
        sistema.enviarOrdenDhl(orden);
    }
    
}
