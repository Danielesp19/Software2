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
public class EnvioExpress implements Envio{

    public EnvioExpress() {
    }
    
    @Override
    public double calcularCostos(double peso, double distancia) {
        return peso*1.0+distancia*0.2;
    }
    
}
