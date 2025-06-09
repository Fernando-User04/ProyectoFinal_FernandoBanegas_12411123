/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_presentacion_12411123;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class mpres {
    
    public double pago_total(double a){
        double pago = a + (a*0.15);
        return pago;
    }
    
    public int tiempo_estimado(int a){
        int tiempo = (a*60)/45;
        return tiempo;
    }
    
}
