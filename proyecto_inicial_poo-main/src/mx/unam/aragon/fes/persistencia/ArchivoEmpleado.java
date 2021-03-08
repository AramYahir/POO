
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;


public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado> datos ){
        //codigo para guardar en dd
        
    }
    
    public ArrayList<Empleado> leerEmpleados(){
        ArrayList<Empleado> tmp=null;
        
        //LEER DEL DD
        //SE SUBE AL ARRAYLIST TMP
        
        return tmp;
    }
}
