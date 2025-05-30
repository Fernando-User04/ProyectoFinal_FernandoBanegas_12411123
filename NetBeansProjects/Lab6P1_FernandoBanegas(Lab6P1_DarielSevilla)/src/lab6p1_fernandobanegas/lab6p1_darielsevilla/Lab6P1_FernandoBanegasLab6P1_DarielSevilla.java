/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_fernandobanegas.lab6p1_darielsevilla;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class Lab6P1_FernandoBanegasLab6P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resp=0;
        do{
            System.out.println("----Menu de Opciones Lab6----");
            System.out.println("1) Rotacion Matricial");
            System.out.println("2) Es par???");
            System.out.println("3) Salir");
            System.out.print("Opcion : ");
            resp=entrada.nextInt();
            switch(resp){
                case 1:
                    System.out.println("----Rotacion Matricial----");
                    int n;
                    do {
                        System.out.print("Ingrese size de matriz (numero impar): ");
                        n = entrada.nextInt();
                    } while (n % 2 == 0);

                    int[][] matriz = GM(n);
                    System.out.println("--------Matriz normal--------");
                    imprimir(matriz);

                    System.out.print("Ingrese input de rotacion : ");
                    String input = entrada.next();
                    char direccion = input.charAt(0);
                    int cantidad = Integer.parseInt(input.substring(1));

                    matriz = rotar(matriz, cantidad, direccion);
                    System.out.println("--------Matriz rotada--------");
                    imprimir(matriz);
                    break;
                case 2:
                    System.out.println("----Es Par???----");
                    
                    break;
                case 3:
                    System.out.println("Saliendo del menu....");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
                    break;
            }
        }while(resp!=3);
        System.out.println("Que tenga un buen dia, gracias por usar el programa :) ");
    }
    
        public static int[][] GM(int n) {
        Random leer = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matriz[i][j] = leer.nextInt(10);
        return matriz;
    }

        
        public static void imprimir(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print("[" + val + "]");
            }
            System.out.println();
        }
    }
        
        
        public static int[][] rotar(int[][] matriz, int veces, char direccion) {
        veces = veces % 4; 
        for (int i = 0; i < veces; i++) {
            if (direccion == '+') {
                matriz = Derecha(matriz);
            } else if (direccion == '-') {
                matriz = Izquierda(matriz);
            }
        }
        return matriz;
    }

        private static int[][] Derecha(int[][] matriz) {
        int n = matriz.length;
        int[][] xd = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                xd[j][n - 1 - i] = matriz[i][j];
        return xd;
    }

        private static int[][] Izquierda(int[][] matriz) {
        int n = matriz.length;
        int[][] xd = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                xd[n - 1 - j][i] = matriz[i][j];
        return xd;
    }
    
    
}
