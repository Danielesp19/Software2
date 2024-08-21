/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software2;

import visual.Calculable;

/**
 *
 * @author Usuario
 */
public class CalculadorDeSalario implements Calculable {
    private Usuario usuario;
    private int horas;

    public CalculadorDeSalario(Usuario usuario,int horas) {
        this.usuario = usuario;
        this.horas = horas;
    }

    @Override
    public double calcular() {
        return usuario.getSalarioBase()+this.horas*4000; 
    }
}
