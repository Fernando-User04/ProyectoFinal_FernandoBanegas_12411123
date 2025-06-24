/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fernando
 */
public class babosa {
    private String name;
    private String elemento;
    private int dano;
    private boolean estado;
    
    
    public void babosa(String name, String elemento, int dano, boolean estado){
        this.name = name;
        this.elemento = elemento;
        this.dano = dano;
        this.estado = estado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    

    @Override
    public String toString() {
        return "Nombre = "+name+"\nElemento = "+elemento+"\nDano = "+dano+"\nEstado = "+estado;
    }
    
    
}
