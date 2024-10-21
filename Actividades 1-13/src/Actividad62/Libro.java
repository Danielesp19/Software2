/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad62;

/**
 *
 * @author Usuario
 */
public class Libro implements LibreriaLibro{
    private String nombre;
    private int numeroHojas;
    private String portada;

    public Libro(String nombre, int numeroHojas, String portada) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.portada = portada;
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

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
    
    

    @Override
    public void devolver() {
        System.out.println("libro devuelto");
    }

    @Override
    public void prestar() {
        System.out.println("libro prestado");
    }

    @Override
    public void renovarPortada() {
        System.out.println("portada renovada");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("mantenimiento realizado");
    }

    @Override
    public void solicitarNuevaVersion() {
        System.out.println("version actualizada");
    }
}
