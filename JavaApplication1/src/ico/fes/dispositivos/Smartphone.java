/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.dispositivos;

/**
 *
 * @author aramy
 */
public class Smartphone {
    private String marca;
    private String modelo;
    private String color;
    private float tamaño;
    
    public Smartphone() {
    }
    
    public Smartphone(String m, String mod, String c, float t) {
        this.marca = m;
        this.modelo = mod;
        this.color = c;
        this. tamaño = t;
    }

    public Smartphone(String m) {
        this.marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Smartpone{" + "marca=" + marca + ", modelo=" + modelo + ", color="  + color + ", tamaño=" + tamaño;
    }
    public boolean encender() {
        System.out.println("Encendiendo el equipo"+ this.marca );
        return true;
    }
    
    /**
     * 
     * @param numeroDestino
     * @return 
     */
    public int llamar(int numeroDestino){
        System.out.println("LLamando al numero " + numeroDestino);
        return 60;
        
    }
    
    public void tomarFoto(){
        System.out.println("Tomando foto....");
    }
}
