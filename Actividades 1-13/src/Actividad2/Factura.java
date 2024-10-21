/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Usuario
 */
public class Factura {
    private String idFactura;
    private double monto;
    private Cliente cliente; 


    public Factura(Cliente cliente,String idFactura, double monto) {
        this.idFactura = idFactura;
        this.monto = monto;
        this.cliente= cliente;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public double getMonto() {
        return monto;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    public void guardarFactura(FalsaBaseDeDatos base) {
        base.guardarFactura(this);
        
    }

    public void enviarFacturaDian() {
        System.out.println("Factura " + idFactura + " enviada a la DIAN.");
    }
}
