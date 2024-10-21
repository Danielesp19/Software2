/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltaCohesionYBajoAcoplamiento;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class ProcesadorFactura {

    public ProcesadorFactura() {
    }
    
    public double calcularTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioProducto();
        }
        return total;
    }
    

    public double aplicarDescuento(Factura factura, double descuento) {
        double totalConDescuento = factura.getTotal() * (1 - descuento);
        factura.setTotal(totalConDescuento);
        return totalConDescuento;
    }

    public String generarNumeroFactura(Factura factura) {
        return "#" + factura.getFechaFactura().getTime();
    }

    public void procesarFactura(Factura factura) {
        System.out.println("Procesando factura para el cliente: " + factura.getCliente().getNombreCliente());
    }
}