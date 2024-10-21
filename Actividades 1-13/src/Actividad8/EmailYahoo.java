/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class EmailYahoo extends Email{
    private String archivo;

    public EmailYahoo(String archivo, String to, String Subject, String body) {
        super(to, Subject, body);
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    
}
