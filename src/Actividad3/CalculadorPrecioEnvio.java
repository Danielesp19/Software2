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
public class CalculadorPrecioEnvio {

    public double calcularPrecio(Envio envio, double peso, double distancia) {
        return envio.calcularCostos(peso, distancia);
    }
}
