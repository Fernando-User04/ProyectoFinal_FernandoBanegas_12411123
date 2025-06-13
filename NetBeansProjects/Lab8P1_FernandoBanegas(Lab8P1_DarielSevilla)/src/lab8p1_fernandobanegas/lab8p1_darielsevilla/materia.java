/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_fernandobanegas.lab8p1_darielsevilla;

/**
 *
 * @author Fernando
 */
public class materia {
    private String nombre;
    private String tipo;
    
    
    public void materia(){
    }
    
    public void materia(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
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

    @Override
    public String toString() {
        return "materia{" + "nombre=" + nombre + ", tipo=" + tipo + '}';
    }
    
    
    
}
