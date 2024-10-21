/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FabricacionPura;

import java.util.ArrayList;
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
        FabricaPedidos FabricaPedidos = new FabricaPedidos();
        Cliente cliente = FabricaPedidos.crearCliente("Daniel", "Calle R");

        // Crear productos
        List<Producto> productos = new ArrayList<>();
        productos.add(FabricaPedidos.crearProducto("mesa 1", 1200.00, 1));
        productos.add(FabricaPedidos.crearProducto("mesa 2", 25.00, 2));
        productos.add(FabricaPedidos.crearProducto("mesa 3", 45.00, 1));

        // Crear un pedido
        Pedido pedido = FabricaPedidos.crearPedido(cliente, productos);

        // Mostrar los detalles del pedido
        pedido.mostrarDetallesPedido();
    }
    
}
