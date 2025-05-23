/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1p1_fernandobanegas.examen1p1_darielsevilla;
import java.util.Scanner;
import java.util.Random;
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
                    System.out.print("Ingrese el tamaño del arreglo (mayor a 5): ");
                    int tamano = entrada.nextInt();
                    while (tamano <= 5) {
                        System.out.print("El tamaño debe ser mayor a 5. Inténtelo de nuevo: ");
                        tamano = entrada.nextInt();
                    }
                    int[] arreglo = new int[tamano];
                    llenar(arreglo);
                    System.out.print("Arreglo generado: ");
                    impresion(arreglo);
                    System.out.print("Ingrese la cadena de rotación (formato i|d:numero): ");
                    String e = entrada.next();
                    char di = e.charAt(0);
                    int pos = Integer.parseInt(e.substring(2));
                    arreglo = rotar(arreglo, di, pos);
                    System.out.print("Arreglo después de la rotación: ");
                    impresion(arreglo);
                  
                    break;
                case 3 :
                    System.out.println("----Bono----");
                    System.out.print("Ingrese el tamaño de su figura (impar y mayor o igual a 7): ");
                    int n = entrada.nextInt();
                    if (n < 7 || n % 2 == 0) {
                        System.out.println("Error: El número debe ser impar y mayor o igual a 7.");
                        return;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print("- ");
                    }
                    System.out.println();
                    for (int i = 0; i < n / 2 + 1; i++) {
                        for (int j = 0; j < n; j++) {
                            if (j == i || j == n - i - 1) {
                                System.out.print("+ ");
                            } else if (j > i && j < n - i - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = n / 2 - 1; i >= 0; i--) {
                        for (int j = 0; j < n; j++) {
                            if (j == i || j == n - i - 1) {
                                System.out.print("+ ");
                            } else if (j== n /2 ) {
                                System.out.print("* ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.print("- ");
                    }
                    System.out.println();
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
    

        public static void llenar(int[] arreglo) {
            Random leer = new Random();
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = leer.nextInt(100) + 1;
            }
        }

        public static int[] rotar(int[] arreglo, char di, int pos) {
            int[] res = new int[arreglo.length];
            int n = arreglo.length;

            for (int i = 0; i < n; i++) {
                int nuevoIndice;
                if (di=='i') {
                    nuevoIndice = (i+(n-pos))%n;
                } else {
                    nuevoIndice = (i+pos)%n;
                }
                res[nuevoIndice] = arreglo[i];
            }
            return res;
        }

            public static void impresion(int[] arreglo) {
            System.out.print("[ ");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]);
                if (i < arreglo.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println(" ]");

        }

}
