/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad2;

/**
 *
 * @author Usuario
 */
public class Email {

    public void enviarEmailFactura(Factura factura) {
        System.out.println("se envio una copia de la factura: "+ factura.getIdFactura()+"  a el cliente  " +factura.getCliente().getEmail() );
    }
}
