/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_fernandobanegas.lab8p1_darielsevilla;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Lab8P1_FernandoBanegasLab8P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<materia> mat = new ArrayList();
        ArrayList<enemigo> ene = new ArrayList();
        System.out.println("-----F I N A L   F A N T A S Y-----");
        System.out.println("");
        int resp = 0;
        do{
            System.out.println("----Menu de Opciones----");
            System.out.println("1) Agregar materia\n2) Agregar enemigo\n3) Listar poder magico actual\n4) Simulacion\n5) Salir");
            System.out.print("Ingrese opcion : ");
            resp = read.nextInt();
            System.out.println("");
            switch(resp){
                case 1: 
                    System.out.println("----Agregar Materia----");
                    materia m = new materia();
                    System.out.println("");
                    boolean x = false;
                    do {
                        System.out.println("Que tipo de materia desea : ");
                        System.out.println("1) Materia de ataque\n2) Materia de apoyo ");
                        System.out.print("Ingrese el tipo : ");
                        int t = read.nextInt();
                        String tipo;
                        String nombre;
                        switch(t){
                            case 1:
                                tipo = "ataque";
                                boolean y = false;
                                do {
                                    System.out.println("Que habilidad de materia desea agregar : ");
                                    System.out.println("1) fuego\n2) electrico\n3) hielo");
                                    int ha = read.nextInt();
                                    switch(ha){
                                        case 1:
                                            nombre = "fuego";
                                            y = true;
                                            break;
                                        case 2:
                                            nombre = "electrico";
                                            y = true;
                                            break;
                                        case 3:
                                            nombre = "hielo";
                                            y=true;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida, intente nuevamente.");
                                            y = false;
                                            break;
                                    }
                                } while (!y);
                                x=true;
                                break;
                            case 2:
                                tipo = "apoyo";
                                boolean p=false;
                                do {
                                    System.out.println("Que habilidad de materia desea agregar : ");
                                    System.out.println("1) todos\n2) elemental\n3) curar");
                                    System.out.print("Ingrese opcion : ");
                                    int c = read.nextInt();
                                    switch(c){
                                        case 1:
                                            nombre = "todos";
                                            p=true;
                                            break;
                                        case 2:
                                            nombre = "elemental";
                                            p=true;
                                            break;
                                        case 3:
                                            p=true;
                                            nombre = "curar";
                                            break;  
                                        default:
                                            System.out.println("Opcion no valida, intente nuevamente.");
                                            p = false;
                                            break;
                                    }
                                } while (!p);
                                x=true;
                                break;
                            default:
                                System.out.println("Opcion no valida intente nuevamente.");
                                x=false;
                                break;
                        }
                    } while (!x);
                    

                    
                    
                    break;
                case 2:
                    System.out.println("----Agregar Enemigo----");
                    break;
                case 3:
                    System.out.println("----Listar Poder Magico Actual----");
                    break;
                case 4:
                    System.out.println("----Simulacion----");
                    break;
                case 5:
                    System.out.println("Saliendo del juego....");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
            }
        }while(resp!=5);

    }
    
}
