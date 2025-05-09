/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_fernandobanegaslab2p1_darielsevilla;
import java.util.Scanner;
/**
 *
 * @author Fernando
 */
public class Lab3P1_FernandoBanegasLab2P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp = 0;
        do{
            System.out.println("-----Menu de Opciones-----");
            System.out.println("1-Impresiones de Diamante");
            System.out.println("2-Cuadrado con patron");
            System.out.println("3-Trapecio por porcentaje");
            System.out.println("4-Salir");
            System.out.println("Ingrese opcion : ");
            resp = entrada.nextInt();
            switch (resp){
                case 1:
                    System.out.println("-----Impresiones de Diamante-----");
                    System.out.println("Ingrese el tamanio de la figura (de preferencia que sea impar) : ");
                    int tam = entrada.nextInt();
                    int m = tam/2;
                    System.out.println("Como desea la figura?");
                    System.out.println("1- *");
                    System.out.println("2- ' ' ");
                    System.out.println("3- +");
                    System.out.println("Ingrese opcion : ");
                    int opcion = entrada.nextInt();
                    char car = 0;
                    switch (opcion){
                        case 1:
                            car = '*';
                            break;
                        case 2:
                            car = ' ';
                            break;
                        case 3:
                            car = '+';
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }   
                    for (int i = 0; i < tam; i++) {
                        int e;
                        int c;
                        if (i <= m) {
                            e= m - i;
                            c= 2 * i + 1;
                        } else {
                            e= i - m;
                            c= 2 * (tam - i - 1) + 1;
                        }
                        for (int j = 0; j < e; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < c; j++) {
                            if (opcion == 2) {
                                if (j == 0 || j == c-1) {
                                    System.out.print("* ");
                                } else {
                                    System.out.print("  ");
                                }
                            } else {
                                System.out.print(car+" ");
                            }
                        }

                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("-----Cuadrado con Patron-----");
                    int tan = entrada.nextInt();
                    if (tan%2==0){
                        System.out.println("El numero debe de ser impar...saliendo del programa, regrese mas tarde");
                    }else{
                        int filas;
                        for(filas=0;filas<tan;filas++){
                            for(int columna=0;columna<tan;columna++){
                                System.out.print("- ");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                case 3: 
                    System.out.println("-----Trapecio por porcentaje-----");
                    System.out.print("Ingrese un número para el tamaño del trapecio: ");
                    int tamaño = entrada.nextInt();
                    System.out.print("Ingrese el porcentaje que se mostrara de la figura: ");
                    int porcentaje = entrada.nextInt();
                    int total = tamaño * 2 + 2;
                    double cm = total * porcentaje / 100.0;
                    int columnasAMostrar = Math.round((float) cm);
                    for (int fila = 1; fila <= tamaño; fila++) {
                        int columnasEnFila = fila * 2;
                        if (columnasEnFila > columnasAMostrar) {
                            columnasEnFila = columnasAMostrar;
                        }
                        int espacios = (columnasAMostrar - columnasEnFila) / 2;

                        for (int i = 0; i < espacios; i++) {
                            System.out.print(" ");
                        }
                        for (int i = 0; i < columnasEnFila; i++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa :) ");
                    break;
                default:
                    System.out.println("Error en eleccion de ejercicio, intente nuevamente.");
                    break;
            }
            
        }while(resp!=4);
    }
    
}
