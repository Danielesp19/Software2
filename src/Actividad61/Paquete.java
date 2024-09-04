/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad61;

/**
 *
 * @author Usuario
 */
public abstract class Paquete {
    private double peso;
    private double dimenciones;

    public Paquete(double peso, double dimenciones) {
        this.peso = peso;
        this.dimenciones = dimenciones;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(double dimenciones) {
        this.dimenciones = dimenciones;
    }
    
    
}
