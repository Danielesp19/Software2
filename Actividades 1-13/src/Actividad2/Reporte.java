/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Usuario
 */
public class Reporte {

    public void generarReporteFacturas(FalsaBaseDeDatos base) {
        System.out.println("Reporte de Facturas:");
        for (Factura factura : base.obtenerFacturas()) {
            System.out.println(factura.getIdFactura()+"   "+factura.getCliente()+"   "+factura.getMonto());
        }
    }
}
