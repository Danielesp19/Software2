/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

/**
 *
 * @author Usuario
 */
public class DhlImpl implements IProcesarOrdenDhl{

    @Override
    public void enviarOrdenDhl(Orden orden) {
        System.out.println("        >> con la operadora Dhl");
        System.out.println(orden.getLugarOrigen());
        System.out.println("hacia");
        System.out.println(orden.getLugarDestino());
    }
    
}
