/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class FalsaBaseDeDatos {
    private ArrayList<Factura> facturas;
    private ArrayList<Cliente> clientes;

    public FalsaBaseDeDatos() {
        this.facturas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void guardarFactura(Factura factura) {
        facturas.add(factura);
        System.out.println("Factura guardada con exito.");
    }

    public void guardarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente guardado con exito.");
    }

    public ArrayList<Factura> obtenerFacturas() {
        return facturas;
    }

}
