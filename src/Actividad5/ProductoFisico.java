/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author Usuario
 */
public class ProductoFisico extends ProductoEnviable {
    public ProductoFisico(double peso, String nombre, double precio, int cantidad) {
        super(peso, nombre, precio, cantidad);
    }

    @Override
    public double calcularCosto() {
        return getCantidad() * getPrecio();
    }

    @Override
    public double calcularEnvio(double peso, double distancia) {
        return peso * distancia * 0.5;
    }
}
