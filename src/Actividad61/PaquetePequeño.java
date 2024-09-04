/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad61;

/**
 *
 * @author Usuario
 */
public class PaquetePequeño extends Paquete implements OperablePaquetePequeño{
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.valorDeclarado = valorDeclarado;
    }
    

    @Override
    public void calcularCostoEnvio() {
        System.out.println("El valor del envio del paquete pequeño es de:   "+valorDeclarado*getPeso()*getDimenciones());
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }
    
    
}
