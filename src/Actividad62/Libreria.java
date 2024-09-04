/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad62;

/**
 *
 * @author Usuario
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cartilla c = new Cartilla("cartilla1", 20);
        Libro l = new Libro("libro", 30, "sin portada");
        Dvd d = new Dvd("dvd", 30, "c/dvds");
        
        c.prestar();
        c.devolver();
        c.mantenimientoHojas();
        
        l.prestar();
        l.devolver();
        l.renovarPortada();
        l.mantenimientoHojas();
        l.solicitarNuevaVersion();
        
        d.prestar();
        d.devolver();
        
    }
    
}
