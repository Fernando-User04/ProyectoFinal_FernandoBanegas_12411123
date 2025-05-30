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
                    Scanner scanner = new Scanner(System.in);

                    int vidas = 3;
                    int tamano = 4;

                    int[][] solucion = new int[tamano][tamano];
                    char[][] oculto = new char[tamano][tamano];

                    llenar(solucion, oculto);

                    int paresEncontrados = 0;
                    int totalPares = (tamano * tamano) / 2;

                    while (vidas > 0 && paresEncontrados < totalPares) {
                        System.out.println("Vidas: " + vidas);
                        mostrar(oculto);

                        System.out.print("Ingrese fila y columna de la primera casilla (numero/espacio/numero): ");
                        int f1 = scanner.nextInt();
                        int c1 = scanner.nextInt();

                        System.out.print("Ingrese fila y columna de la segunda casilla(numero/espacio/numero): ");
                        int f2 = scanner.nextInt();
                        int c2 = scanner.nextInt();

                        if (!validez(f1, c1, tamano) || !validez(f2, c2, tamano)) {
                            System.out.println("Coordenadas inválidas.");
                            continue;
                        }

                        if ((f1 == f2 && c1 == c2) || oculto[f1][c1] != 'X' || oculto[f2][c2] != 'X') {
                            System.out.println("Casillas inválidas o ya descubiertas.");
                            continue;
                        }

                        int val1 = solucion[f1][c1];
                        int val2 = solucion[f2][c2];

                        System.out.println("Primera casilla: " + con(val1));
                        System.out.println("Segunda casilla: " + con(val2));

                        if (val1 == val2) {
                            oculto[f1][c1] = con(val1);
                            oculto[f2][c2] = con(val2);
                            paresEncontrados++;
                            System.out.println("¡Par encontrado!");
                        } else {
                            System.out.println("No son iguales.");
                            vidas--;
                        }
                    }

                    if (paresEncontrados == totalPares) {
                        System.out.println("¡Ganaste! Encontraste todos los pares.");
                    } else {
                        System.out.println("Perdiste. Se acabaron las vidas.");
                    }
                    
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
        public static void llenar(int[][] solucion, char[][] oculto) {
        int[] pares = new int[16];
        int valor = 0;
        for (int i = 0; i < 16; i += 2) {
            pares[i] = valor;
            pares[i + 1] = valor;
            valor++;
        }

        for (int i = 0; i < 16; i++) {
            int j = (int)(Math.random() * 16);
            int temp = pares[i];
            pares[i] = pares[j];
            pares[j] = temp;
        }

        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                solucion[i][j] = pares[index];
                oculto[i][j] = 'X';
                index++;
            }
        }
    }

        public static boolean validez(int fila, int col, int tamano) {
            return fila >= 0 && fila < tamano && col >= 0 && col < tamano;
        }

        public static void mostrar(char[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print("["+matriz[i][j]+"]");
                }
                System.out.println();
            }
        }

        public static char con(int numero) {
            if (numero >= 0 && numero <= 9) {
                return (char) ('0' + numero);
            } else {
                return (char) ('A' + (numero - 10));
            }
        }


}
