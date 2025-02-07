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
                    System.out.println("Ingrese el tamano de el cuadrado");
                    int tam = entrada.nextInt();
                    if (tam>=5 && tam % 2 !=0){
                        for (int fila = 1;fila<=tam;fila++){
                            for (int col = 1;col<=tam;col++){
                                for (int iz =1;iz<=tam;iz++){
                                    for (int de=tam;tam>=1;de--){
                                        for (int cont=1;cont<=tam;cont++){
                                            int inicio=1;
                                            
                                        }
                                    }
                                }
                                    
                                    
                                        
                                        
                                        
                                    

                                
                            }
                        }
                    }
                    break;
                case 2:
                    
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
