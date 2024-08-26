/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Usuario
 */
public class SistemaFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FalsaBaseDeDatos base= new FalsaBaseDeDatos();
        Cliente cliente = new Cliente("123", "Juan Perez", "juan.perez@example.com");
        Factura factura = new Factura(cliente,"001", 1500.00);
        
        cliente.guardarCliente(base);
        factura.guardarFactura(base);

        
        Email emailService = new Email();
        emailService.enviarEmailFactura(factura);

        
        factura.enviarFacturaDian();

        
        Reporte reporteService = new Reporte();
        reporteService.generarReporteFacturas(base);
    }
    
}
