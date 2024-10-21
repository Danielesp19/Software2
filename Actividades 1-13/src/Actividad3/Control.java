/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad3;

import Actividad3.visual.Envio;

/**
 *
 * @author Usuario
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalculadorPrecioEnvio calculador = new CalculadorPrecioEnvio();
        Envio envioExpres = new EnvioExpress(); 
        Envio envioEstandar = new EnvioEstandar(); 
        
        double precioExpres = calculador.calcularPrecio(envioExpres, 3.5, 4.3);
        System.out.println("El precio del envio express es:  " + precioExpres);
        
        double precioEstandar = calculador.calcularPrecio(envioEstandar, 3.5, 4.3);
        System.out.println("El precio del envio estandar  es:  " + precioEstandar);
        
    }
    
}
