/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
public abstract class ProductoEnviable extends Producto implements EnviarPorCorreo {
    private double peso;

    public ProductoEnviable(double peso, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public abstract double calcularEnvio(double peso, double distancia);
}
