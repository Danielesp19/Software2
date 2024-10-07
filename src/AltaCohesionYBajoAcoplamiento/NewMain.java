/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AltaCohesionYBajoAcoplamiento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Daniel", "Calle R");

        // Crear una lista de productos comprados
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(101, "Laptop", 1500.00));
        productos.add(new Producto(102, "Mouse", 20.00));
        productos.add(new Producto(103, "Teclado", 50.00));

        // Crear un procesador de facturas
        ProcesadorFactura procesador = new ProcesadorFactura();
        double total = procesador.calcularTotal(productos);
        Factura factura = new Factura(productos, cliente, 0.10, total, new Date());
        System.out.println("Total sin descuento: " + total);
        double totalConDescuento = procesador.aplicarDescuento(factura, factura.getDescuento());
        System.out.println("Total con descuento: " + totalConDescuento);

        String numeroFactura = procesador.generarNumeroFactura(factura);
        System.out.println("Número de factura: " + numeroFactura);

        
        procesador.procesarFactura(factura);
    
    }
    
}
