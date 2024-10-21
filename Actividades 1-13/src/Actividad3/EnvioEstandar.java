/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad3;

import Actividad3.visual.Envio;

/**
 *
 * @author Usuario
 */
public class EnvioEstandar implements Envio{

    public EnvioEstandar() {
    }
    
    @Override
    public double calcularCostos(double peso, double distancia) {
        return peso*0.5+distancia*0.1;
    }
    
}
