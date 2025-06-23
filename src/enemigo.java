/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Fernando
 */
public class enemigo {
    private String name;
    private int vida;
    private int dano;
    
    public void enemigo(){
        
    }
    
    public void enemigo(String name, int vida, int dano){
        this.name = name;
        this.vida = vida;
        this.dano = dano;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    @Override
    public String toString() {
        return "Nombre = "+name+"\nVida = "+vida+"\nDano = "+dano;
    }
    
    
}
