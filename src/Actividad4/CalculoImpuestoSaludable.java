/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad4;

/**
 *
 * @author Usuario
 */
public class CalculoImpuestoSaludable extends Calculo{
    Double impuesto=0.05;

    public CalculoImpuestoSaludable(int cantidad, int precio) {
        super(cantidad, precio);
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }
    
    
    @Override
    public Double calcular(double cantidad, double precio) {
        return precio*cantidad*impuesto;
    }
    
}
