/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tallersrp;

/**
 *
 * @author Usuario
 */
public class ServicioEnvio {
    
    void enviar(Producto p){
        p.setStock(p.getStock()-1);
    }
}
