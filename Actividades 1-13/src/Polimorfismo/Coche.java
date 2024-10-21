/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Coche implements Transportable{
    private String marca;
    private int velocidad;

    public Coche(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("El coche acelera a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        velocidad -= 10;
        System.out.println("El coche frena a " + velocidad + " km/h.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Coche de marca: " + marca);
    }
}
