/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Transportable coche = new Coche("toyota");
        Transportable avion = new Avion("47");
        Transportable bicicleta = new Bicicleta("montaña");

        Garaje garage = new Garaje();

        
        System.out.println("----------------------------");
        garage.estacionar(coche);
        coche.acelerar();
        coche.frenar();

        System.out.println("-----------------------------");
        garage.estacionar(avion);
        avion.acelerar();
        avion.frenar();

        System.out.println("------------------------------");
        garage.estacionar(bicicleta);
        bicicleta.acelerar();
        bicicleta.frenar();
    }
    
}
