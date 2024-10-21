/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad61;

/**
 *
 * @author Usuario
 */
public class PaquetePeligroso extends Paquete implements OperablePaquetePeligroso{
    private String etiquetaPeligro;
    private boolean embajeEspecial;

    public PaquetePeligroso( boolean embajeEspecial, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.embajeEspecial = embajeEspecial;
    }
    
    
    @Override
    public void VerificarContenido() {
        System.out.println("se verifico el contenido del paquete");
    }

    @Override
    public void AsegurarPaquete() {
        if(this.embajeEspecial){
            this.etiquetaPeligro = "Paquete delicado";
            System.out.println("se aseguro el paquete");
        }
    }

    public String getEtiquetaPeligro() {
        return etiquetaPeligro;
    }

    public void setEtiquetaPeligro(String etiquetaPeligro) {
        this.etiquetaPeligro = etiquetaPeligro;
    }

    public boolean isEmbajeEspecial() {
        return embajeEspecial;
    }

    public void setEmbajeEspecial(boolean embajeEspecial) {
        this.embajeEspecial = embajeEspecial;
    }
    
    
    
}
