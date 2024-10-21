/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Garaje {
    public void estacionar(Transportable transporte) {
        System.out.println("---------------------------------");
        transporte.mostrarInformacion();
        System.out.println("Estacionando en el garaje...");
    }
}
