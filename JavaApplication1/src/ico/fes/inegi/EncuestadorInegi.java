/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.inegi;

import ico.fes.dispositivos.Smartphone;

/**
 *
 * @author Montse García
 */
public class EncuestadorInegi {
    private String nombre;
    private Smartphone dispositivo;

    public EncuestadorInegi() {
    }

    public EncuestadorInegi(String nombre, Smartphone dispositivo) {
        this.nombre = nombre;
        this.dispositivo = dispositivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Smartphone getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Smartphone dispositivo) {
        this.dispositivo = dispositivo;
    }
     
}