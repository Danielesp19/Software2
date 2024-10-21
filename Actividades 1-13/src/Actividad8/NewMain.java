/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Actividad8;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Email e = new EmailGmail("1.jpg", "daniel", "felipe", "hola buenos dias por gmail");
        IServicioEmail servicioGmail= new GmailImpl();
        servicioGmail.send(e);
        Email e2 = new EmailOutlook("daniel", "felipe", "hola buenos dias por outlook");
        IServicioEmail servicioOutlook= new OutlookImpl();
        servicioOutlook.send(e2);
        Email e3 = new EmailYahoo("archivo de texto","daniel", "felipe", "hola buenos dias por yahoo");
        IServicioEmail servicioYahoo= new YahooImpl();
        servicioYahoo.send(e3);
        
        
    }
    
}
