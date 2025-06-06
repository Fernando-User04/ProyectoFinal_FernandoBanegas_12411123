/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7p1_fernandobanegas.lab7p1_darielsevilla;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class Lab7P1_FernandoBanegasLab7P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        cancion[]can = new cancion[30];
        cancion[]playlist = new cancion[10];
        Random r = new Random();
        int resp = 0;
        do {
            System.out.println("----Spotify----");
            int posp=0;
            System.out.println("1) Publicar Cancion\n2) Buscar Cancion\n3) Listar canciones en la plataforma\n"
                    + "4) Agregar Canciones a la playlist\n5) Ordenar Playlist\n6) Shuffle de Playlist\n7) Salir");
            System.out.print("Opcion : ");
            resp = entrada.nextInt();
            switch(resp){
                case 1:
                    System.out.println("----Publicar Cancion----");
                    System.out.print("Ingrese el nombre de la cancion : ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.print("Ingrese el nombre del autor : ");
                    String autor = entrada.nextLine();
                    int sec = 0;
                    do {
                        System.out.print("Ingrese duracion de la cancion : ");
                        sec = entrada.nextInt();
                        if(sec==0){
                            System.out.println("*la duracion tiene que ser mayor a 0*");
                        }
                    } while (sec==0);
                    System.out.print("Ingrese codigo de tres caracteres : ");
                    int tam = 0;
                    String codigo = " ";
                    do {
                        codigo = entrada.next();
                        if (codigo.length()!=3) {
                            System.out.println("*El codigo debe de ser de 3 caracteres*");
                            System.out.print("Ingrese nuevo codigo : ");
                        }else{
                            tam=3;
                        }
                        
                        
                    } while (tam!=3);
                    System.out.println("Se agrego la nueva cancion a la plataforma : ");
                    System.out.println("Cancion : "+codigo+" - "+nombre);   
                    System.out.println("Autor : "+autor+" Duracion : "+sec+" seugndos");
                    System.out.println("Escuchada 0 veces.");
                    can[posp]= new cancion(nombre,autor,sec,0,codigo);
                    posp++;
                    break;
                case 2:
                    System.out.println("----Buscar Cancion----");
                    System.out.println("Ingrese cadena de busqueda : ");
                    String cadena = entrada.nextLine();
                    String opcion = cadena.substring(0,5);
                    String nombree = cadena.substring(7,cadena.length());
                    opcion.toLowerCase();
                    if(opcion=="nombre"){
                        for (int i = 0; i < 30; i++) {
                            
                            
                        }
                        
                        
                    }else{
                        
                    }
                    
                    break;
                case 3:
                    System.out.println("----Listar canciones en la plataforma----");
                    break;
                case 4:
                    System.out.println("----Agregar Canciones a la Playlist----");
                    break;
                case 5:
                    System.out.println("----Ordenar Playlist----");
                    break;
                case 6:
                    System.out.println("----Shuffle de Playlist----");
                    break;
                case 7:
                    System.out.println("Saliendo de Spotify.....");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
            }
        } while (resp!=7);
        System.out.println("Gracias por usar Spotify :) ");
    }
    
    public void busqueda(String a){
        
    }
    
}
