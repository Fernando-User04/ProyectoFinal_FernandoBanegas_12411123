/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_presentacion_12411123;

/**
 *
 * @author Fernando
 */
public class repartidor {
    private String pizza;
    private int distancia;
    private double tiempo;
    private String nombrer;
    private String nombrec;
    private double price;
    
    public repartidor(){
    }
    
    public repartidor(String pizza,int distancia, int tiempo, String nombrer, String nombrec, double price){
        this.pizza = pizza;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.nombrec = nombrec;
        this.nombrer = nombrer;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    public String getPizza() {
        return pizza;
    }

    public void setPizza(String pizza) {
        this.pizza = pizza;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombrer() {
        return nombrer;
    }

    public void setNombrer(String nombrer) {
        this.nombrer = nombrer;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    @Override
    public String toString() {
        return "repartidor{" + "pizza=" + pizza + ", distancia=" + distancia + ", tiempo=" + tiempo + ", nombrer=" + nombrer + ", nombrec=" + nombrec + '}';
    }
    
}
