/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad5;

/**
 *
 * @author Usuario
 */
public class ProductoDigital extends Producto {
    private double tamañoArchivo;

    
    
    

    public ProductoDigital(double tamañoArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    @Override
    public double calcularCosto() {
        return getCantidad() * getPrecio() * tamañoArchivo;
    }
}
