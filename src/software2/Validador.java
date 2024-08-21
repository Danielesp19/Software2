/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package software2;

import visual.Autenticable;

/**
 *
 * @author Usuario
 */
public class Validador implements Autenticable {
    private final Usuario usuario;

    public Validador(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean autenticar(String credencial) {
        if(usuario.getPassword().equals(credencial))
            return true;
        
        return false;
    }
}
