/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_fernandobanegas.examen1p1_darielsevilla;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class Examen1P1_FernandoBanegasExamen1P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp = 0;
        do{
            System.out.println("----Menu de Examen de Lab----");
            System.out.println("");
            System.out.println("1) Plantas vs Zombies ");
            System.out.println("2) Rotacio Circular de Arreglo");
            System.out.println("3) Bono");
            System.out.println("4) Salir");
            System.out.print("Opcion : ");
            resp=entrada.nextInt();
            switch(resp){
                case 1 :
                    System.out.println("----Plantas vs Zombies----");
                    
                    break;
                case 2 :
                    System.out.println("----Rotacion Circular de arreglo----");
                    
                    
                    break;
                case 3 :
                    System.out.println("----Bono----");
                    System.out.print("Ingrese el tamanio de la figura : ");
                    int tam = entrada.nextInt();
                    int fila1 = 0;
                    int fila2 = tam;
                    int li = 1;
                    int ld =tam-1;
                    for(int cont=0;cont<=tam;cont++){
                        if(cont==0||cont==tam){
                        for(int cont2=0;cont2<=tam;cont2++){
                            System.out.print("- ");
                            }
                        }else{
                            for(int cont3=1;cont3<=tam-1;cont3++){
                                if(cont3==li||cont3==ld){
                                    System.out.print("+ ");
                                }
                            }
                        }
                        System.out.println("");
                        li++;
                        ld--;
                    }
                    
                    break;
                case 4 :
                    System.out.println("Saliendo del programa....");
                    break;
                default :
                    System.out.println("Error en eleccion de ejercicio, intente nuevamente.");
                    break;
            }
            
            System.out.println("---------------------------");
            
            
        }while(resp!=4);
        System.out.println("Gracias por usar el programa.");
    }
    
}
