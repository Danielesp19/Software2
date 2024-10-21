/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad61;

/**
 *
 * @author Usuario
 */
public class Paqueteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteGrande paquetegrande= new PaqueteGrande(3, "camion", 6, 20);
        PaquetePequeño paquetepequeño= new PaquetePequeño(300, 6, 20);
        PaquetePeligroso paquetepeligroso= new PaquetePeligroso(true, 6, 20);
        
        paquetepeligroso.AsegurarPaquete();
        paquetepeligroso.VerificarContenido();
        if(paquetepeligroso.isEmbajeEspecial())
            System.out.println("el paquete esta protegido");
        else
            System.out.println("el paquete no esta protegido");
        
        paquetegrande.calcularCostoEnvio();
        paquetepequeño.calcularCostoEnvio();
        
        
    }
    
}
