/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller5;

/**
 *
 * @author Usuario
 */
public class Empresa {
    public double calcularPrecio(Producto p) {
        return p.calcularCosto();
    }
    public void enviarPorCorreo(Producto p,double distancia){
         if (p instanceof EnviarPorCorreo) {
            EnviarPorCorreo enviable = (EnviarPorCorreo) p;
            double costoEnvio = enviable.calcularEnvio(((ProductoEnviable) p).getPeso(), distancia);
            System.out.println("Costo de envio es :   " + costoEnvio);
        } else {
            System.out.println("Este producto no se puede enviar por correo.");
        }
    }
}
