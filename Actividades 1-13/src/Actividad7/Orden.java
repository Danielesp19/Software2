/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividad7;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Orden {
    private String lugarOrigen;
    private String lugarDestino;
    private Date fecha;

    public Orden(String lugarOrigen, String lugarDestino) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public void setLugarDestino(String lugarDestino) {
        this.lugarDestino = lugarDestino;
    }
    
    
}
