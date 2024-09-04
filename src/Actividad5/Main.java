/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa e= new Empresa();
        
        Producto p1= new ProductoFisico(4, "mesa", 30, 2);
        Producto p2= new ProductoMixto(4, "mesa", 30, 2,4);
        Producto p3= new ProductoDigital(4, "mesa", 30, 2);
        
        System.out.println(e.calcularPrecio(p1));
        System.out.println(e.calcularPrecio(p2));
        System.out.println(e.calcularPrecio(p3));
        
        e.enviarPorCorreo(p1, 100); 
        e.enviarPorCorreo(p2, 50);  
        e.enviarPorCorreo(p3, 200); 
    }
    
}
