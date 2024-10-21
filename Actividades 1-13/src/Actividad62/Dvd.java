/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad62;

/**
 *
 * @author Usuario
 */
public class Dvd implements LibreriaDvd{
    private String nombre;
    private int stok;
    private String archivo;

    public Dvd(String nombre, int stok, String archivo) {
        this.nombre = nombre;
        this.stok = stok;
        this.archivo = archivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
    @Override
    public void prestar() {
        if (this.stok>0){
            System.out.println("dvd prestado");
            this.stok--;
        }
        else
            System.out.println("no hay disponible");
    }

    @Override
    public void devolver() {
        System.out.println("dvd devuelto");
        this.stok++;
    }
}
