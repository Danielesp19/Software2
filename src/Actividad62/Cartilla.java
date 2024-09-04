/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad62;

/**
 *
 * @author Usuario
 */
public class Cartilla implements LibreriaCartilla{
    private String nombre;
    private int numeroHojas;

    public Cartilla(String nombre, int numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }
    
    
    @Override
    public void devolver() {
        System.out.println("cartilla devuelta");
    }

    @Override
    public void prestar() {
        System.out.println("cartilla prestada");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("mantenimiento realizado");
    }
}
