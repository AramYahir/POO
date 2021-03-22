/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import Ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author aramy
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Bocho
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubMarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.BLUE);
        System.out.println( miBocho);
        //Akura
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        miAkura.setSubMarca("NSX");
        miAkura.setModelo(2013);
        miAkura.setColor(Color.GRAY);
        System.out.println( miAkura);
        //Mustang
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubMarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println( miMustang);
    }
    
}
