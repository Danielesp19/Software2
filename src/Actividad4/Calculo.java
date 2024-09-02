/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Usuario
 */
public abstract class Calculo  {
    int cantidad;
    int precio;

    public Calculo( int cantidad, int precio) {

        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    
   public abstract Double calcular( double cantidad,double precio);


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
   
   
}
