/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Avion implements Transportable{
    private String modelo;
    private int altitud;

    public Avion(String modelo) {
        this.modelo = modelo;
        this.altitud = 0;
    }

    @Override
    public void acelerar() {
        altitud += 1000;
        System.out.println("El avión asciende a " + altitud + " metros.");
    }

    @Override
    public void frenar() {
        altitud -= 500;
        System.out.println("El avión desciende a " + altitud + " metros.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avión de modelo: " + modelo);
    }
}
