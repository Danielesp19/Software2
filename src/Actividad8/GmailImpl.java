/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class GmailImpl implements IServicioEmail{
    

    @Override
    public void send(Email e) {
        EmailGmail gmail= (EmailGmail) e;
        System.out.println("Mensaje enviado de:  "+gmail.getSubject());
        System.out.println(" Para :  "+gmail.getTo());
        System.out.println("Mensaje :  "+gmail.getBody());
        System.out.println("imagen :  "+gmail.getImagen());
    }
    
}
