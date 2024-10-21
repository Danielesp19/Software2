/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class OutlookImpl  implements IServicioEmail{

    
    
    @Override
    public void send(Email e) {
        EmailOutlook outlook= (EmailOutlook) e;
        System.out.println("Mensaje enviado de:  "+outlook.getSubject());
        System.out.println(" Para :  "+outlook.getTo());
        System.out.println("Mensaje :  "+outlook.getBody());

    }
    
}
