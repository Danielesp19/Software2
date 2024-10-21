/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Usuario
 */
public class UpsImpl implements IProcesarOrdenUps{

    @Override
    public void enviarOrdenUps(Orden orden) {
        System.out.println("        >> con la operadora Ups");
        System.out.println(orden.getLugarOrigen());
        System.out.println("hacia");
        System.out.println(orden.getLugarDestino());
    }
    
}
