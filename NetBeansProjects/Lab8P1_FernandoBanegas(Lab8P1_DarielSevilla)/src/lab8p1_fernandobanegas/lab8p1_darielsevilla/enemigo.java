/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_fernandobanegas.lab8p1_darielsevilla;

/**
 *
 * @author Fernando
 */
public class enemigo {
    private String nombre;
    private String tipo;
    private int vida;
    
    public void enemigo(){
        
    }
    
    public void enemigo(String nombre, String tipo, int vida){
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "enemigo{" + "nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + '}';
    }
    
    
    
}
