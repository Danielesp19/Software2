/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
public class ProductoMixto extends ProductoEnviable {
    private double tamañoArchivo;

    public ProductoMixto(double peso, String nombre, double precio, int cantidad, double tamañoArchivo) {
        super(peso, nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return (getCantidad() * getPrecio()) + (tamañoArchivo * getPrecio());
    }

    @Override
    public double calcularEnvio(double peso, double distancia) {
        return peso * distancia * 0.7;
    }
}
