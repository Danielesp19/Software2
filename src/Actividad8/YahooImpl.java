/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class YahooImpl  implements IServicioEmail{

    
    
    
    @Override
    public void send(Email e) {
        EmailYahoo yahoo= (EmailYahoo) e;
        System.out.println("Mensaje enviado de:  "+yahoo.getSubject());
        System.out.println(" Para :  "+yahoo.getTo());
        System.out.println("Mensaje :  "+yahoo.getBody());
        System.out.println("Mensaje :  "+yahoo.getArchivo());
    }
    
    
}
