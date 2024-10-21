/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FabricacionPura;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class FabricaPedidos {
    private static int contadorPedidos = 0;

    public FabricaPedidos() {
    }
    
    public static Pedido crearPedido(Cliente cliente, List<Producto> productos) {
        contadorPedidos++;
        return new Pedido(contadorPedidos, cliente, productos);
    }

    public static Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }

    public static Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }
}
