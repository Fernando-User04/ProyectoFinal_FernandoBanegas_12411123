/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.p1_fernandobanegas.lab3p1_fernandobanegas;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class LabP1_FernandoBanegasLab3P1_FernandoBanegas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp=0;
        while (resp!=4){
            System.out.println("------Menu------");
            System.out.println("1) Ejercicio 1: Corbatin");
            System.out.println("2) Ejercicio 2: Permutaciones");
            System.out.println("3) Ejercicio 3: Trapecio hueco");
            System.out.println("4) Salir");
            int eje = entrada.nextInt();
            switch (eje){
                case 1:
                    System.out.print("Ingrese un numero impar mayor a 5 : ");
                    int num = entrada.nextInt();
                    if (num>=5&&num%2!=0){
                    for (int fila = 1; fila < num - 1; fila++){  
                        for (int c = 0; c < num; c++) {
                    if (c == 0 || fila == c || c == num - 1 || fila + c == num - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");                    
            }
                        
                    }
                
                    break;
                case 2:
                    System.out.println("Permutaciones");
                    System.out.print("Ingrese su valor n : ");
                    int n = entrada.nextInt();
                    System.out.print("Ingrese su valor r : ");
                    int r = entrada.nextInt();
                    if (n>=r){
                       int numerador=1;
                        for(int contador=1;contador<=n;contador++){
                            numerador *= contador;
                        }
                        int resta = n-r;
                        int denominador=1;
                        for(int contador2=1;contador2<=resta;contador2++){
                            denominador *= contador2;
                        }
                        
                        int factorial = numerador/denominador;
                        
                        System.out.println("Permiutaciones posible con n= "+n+" y r= "+r+" es : "+factorial);
                        
                    }else{
                        System.out.println("El valor r es mayor al valor n por lo tsnto no se puede realizar esta operacion");
                    }
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Gracias por usar el programa");
                    resp = 4;
                    
            }
            
        }
    }
    
}
