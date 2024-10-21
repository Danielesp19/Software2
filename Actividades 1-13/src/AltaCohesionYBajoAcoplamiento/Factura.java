/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AltaCohesionYBajoAcoplamiento;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Factura {
    private List<Producto> productosComprados;
    private Cliente cliente;
    private double descuento;
    private double total;
    private Date fechaFactura;

    public Factura(List<Producto> productosComprados, Cliente cliente, double descuento, double total, Date fechaFactura) {
        this.productosComprados = productosComprados;
        this.cliente = cliente;
        this.descuento = descuento;
        this.total = total;
        this.fechaFactura = fechaFactura;
    }

    public List<Producto> getProductosComprados() {
        return productosComprados;
    }

    public void setProductosComprados(List<Producto> productosComprados) {
        this.productosComprados = productosComprados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }
    
    
}
