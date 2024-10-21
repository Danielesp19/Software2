/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricacionPura;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Cliente cliente, List<Producto> productos) {
        this.id = id;
        this.fecha = new Date();  // La fecha es la del momento de creación del pedido
        this.cliente = cliente;
        this.productos = productos;
    }

    public void mostrarDetallesPedido() {
        System.out.println("ID Pedido: " + id);
        System.out.println("fecha: " + fecha);
        System.out.println("cliente: " + cliente.getNombre() + " - direccionn: " + cliente.getDireccion());
        System.out.println("productos:");
        for (Producto producto : productos) {
            System.out.println( producto.getNombre() + " x" + producto.getCantidad() + " - $" + producto.getPrecio());
        }
        System.out.println("Total: " + calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }
}
