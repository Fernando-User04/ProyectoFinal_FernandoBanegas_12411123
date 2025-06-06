/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p1_fernandobanegas.lab7p1_darielsevilla;

/**
 *
 * @author Fernando
 */
public class cancion {
    private String nombre;
    private String autor;
    private int duracion;
    private int veces_escuchada;
    private String codigo;
    
    public cancion(){
    }
    
    public cancion(String nombre, String autor, int duracion, int veces_escuchada, String codigo){
        this.nombre = nombre;
        this.autor = autor;
        this.duracion = duracion;
        this.veces_escuchada = veces_escuchada;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getVeces_escuchada() {
        return veces_escuchada;
    }

    public void setVeces_escuchada(int veces_escuchada) {
        this.veces_escuchada = veces_escuchada;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "cancion{" + "nombre=" + nombre + ", autor=" + autor + ", duracion=" + duracion + ", veces_escuchada=" + veces_escuchada + ", codigo=" + codigo + '}';
    }
    
    
    
}
