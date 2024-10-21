/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Bicicleta implements Transportable{
    private String tipo;
    private int velocidad;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 5;
        System.out.println("La bicicleta acelera a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        velocidad -= 3;
        System.out.println("La bicicleta frena a " + velocidad + " km/h.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta de tipo: " + tipo);
    }
}
