/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad61;

/**
 *
 * @author Usuario
 */
public class PaqueteGrande extends Paquete implements OperablePaqueteGrande{
    private double volumen;
    private String medioDeTransporte;

    public PaqueteGrande(double volumen, String medioDeTransporte, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.volumen = volumen;
        this.medioDeTransporte = medioDeTransporte;
    }

    

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getMedioDeTransporte() {
        return medioDeTransporte;
    }

    public void setMedioDeTransporte(String medioDeTransporte) {
        this.medioDeTransporte = medioDeTransporte;
    }

    @Override
    public void calcularCostoEnvio() {
        System.out.println("el precio por ser transportado en "+getMedioDeTransporte()+"    es de:   "+volumen*getPeso()*getDimenciones()*50000);
    }
    
    
}
