/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg1_fernandobanegas.lab4p1_darielsevilla;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Lab1_FernandoBanegasLab4P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int resp = 1;
        do {
            System.out.println("-----Menu de Ejercicios Lab 4-----");
            System.out.println("Eliga uno de los ejercicios a continuacion");
            System.out.println("1-Orden de compras");
            System.out.println("2-Similitud de Peticiones");
            System.out.println("3-Es una rotacion?");
            System.out.println("4-Salir");
            System.out.print("Ejercicio : ");
            resp = entrada.nextInt();
            switch (resp){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Ingrese la cadena de prueba :");
                    String c1 = entrada.next();
                    System.out.println("Ingrese la cadena resultante del hechizo :");
                    String c2 = entrada.next();
                    boolean c = hechizo(c1,c2);
                    if (c){
                        System.out.println("El hechizo ha funcionado! La cadena se ha rotado");
                    }else{
                        System.out.println("El hechizo fue un fracaso, a la otra sera");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, suerte con la granja");
                    resp=4;
                    break;
                default:
                    System.out.println("No esta dentro de las opciones porfavor vuelva a ingresar el ejercicio que desea realizar");
                    break;
                    
            }
            
            
        }while (resp != 4);
    }
    
    
    public static boolean hechizo(String a, String b){
        if (a.length()!=b.length()){
            System.out.println("No tiene la misma cantidad de caracteres");
            return false;
        }else{
        String dupli = b+b;
        return dupli.contains(a);
        }
        
    
        
    }
        
         
            
                
        
    
}
