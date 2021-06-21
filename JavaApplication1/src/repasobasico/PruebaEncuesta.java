/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.Smartphone;
import ico.fes.inegi.EncuestadorInegi;

/**
 *
 * @author aramy
 */
public class PruebaEncuesta {
     public static void main(String[] args) {
         EncuestadorInegi e1 = new EncuestadorInegi();
        e1.setNombre("José");
        e1.setDispositivo( new Smartphone("LG", "MT1", "Gris", 6.0f) );
        System.out.println(e1.getNombre());
        System.out.println(e1.getDispositivo());
    }
}