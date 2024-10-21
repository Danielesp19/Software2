/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad1;

import Actividad1.visual.Autenticable;
import Actividad1.visual.Calculable;
import Actividad1.visual.Notificable;

public class Gestor {

    
    private Usuario usuario2;

    public Gestor() {
        
        usuario2 = new Usuario("daniel e2", "danielep2@gmail.com", "hola1234", 10000);
    }


    public Usuario getUsuario() {
        return usuario2;
    }


    public String enviarCorreo(String destinatario, String mensaje) {
        Notificable correo = new Correo();
        return correo.notificar(destinatario,usuario2.getEmail(), mensaje);
    }

    public String autenticarUsuario(String contraseña) {
        Autenticable validador = new Validador(usuario2);
        if(validador.autenticar(contraseña))
            return usuario2.getNombre()+"           "+usuario2.getEmail()+"         "+usuario2.getSalarioBase();
        return "no coincide";
    }

    public double calcularSalario(int horas) {
        Calculable calculadora = new CalculadorDeSalario(usuario2,horas);
        return calculadora.calcular();
    }
}

