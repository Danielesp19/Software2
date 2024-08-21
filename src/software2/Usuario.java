/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software2;

/**
 *
 * @author Usuario
 */

public class Usuario {
    private  String nombre;
    private  String email;
    private  String password;
    private  double salarioBase;

    public Usuario(String nombre, String email, String password, double salarioBase) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
