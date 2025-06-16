/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal_fernandobanegas;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class ProyectoFinal_FernandoBanegas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        ArrayList<babosa> babo = new ArrayList();
        ArrayList<enemigo> enem = new ArrayList();
        ArrayList<babosa> mochila = new ArrayList();
        System.out.println("- - - - B A J O T E R R A - - - -");
        int resp = 0;
        do {
            System.out.println("");
            System.out.println("----Menu de Opciones----");
            System.out.println("");
            System.out.println("1) Adicionar Babosa\n2) Babosas en el inventario\n3) Agregar babosas a la mochila de batalla"
                    + "\n4) Mochila\n5) Crear enemigo\n6) Lista de enemigos.\n7) Simulador de batalla\n8) Salir");
            System.out.println("");
            System.out.print("Opcion : ");
            while (!entrada.hasNextInt()) {
                     System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                     entrada.next();
                     System.out.print("Inténtelo de nuevo: ");
            }
            resp = entrada.nextInt();
            System.out.println("");
            switch(resp){
                case 1:
                    System.out.println("----Adicionar babosa----");
                    babosa bab = new babosa();
                    System.out.println("");
                    System.out.println("Cual sera el nombre de tu babosa : ");
                    System.out.print("Nombre : ");
                    entrada.nextLine();
                    String nombre = entrada.nextLine();
                    System.out.println("");
                    String elemento = "";
                    boolean x = false;
                    do {
                        System.out.println("Cual quieres que sea el elemento de tu babosa : ");
                        System.out.println("1) fuego\n2) agua\n3) tierra\n4) viento\n5) luz");
                        System.out.print("Opcion : ");
                        while (!entrada.hasNextInt()) {
                            System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                            entrada.next();
                            System.out.println("");
                            System.out.print("Opcion : ");
                        }   
                        int ele = entrada.nextInt();
                        System.out.println("");
                        switch(ele){
                            case 1:
                                elemento = "fuego";
                                x = true;
                                break;
                            case 2:
                                elemento = "agua";
                                x = true;
                                break;
                            case 3:
                                elemento = "tierra";
                                x = true;
                                break;
                            case 4:
                                elemento = "viento";
                                x = true;
                                break;
                            case 5:
                                elemento = "luz";
                                x = true;
                                break;
                            default:
                                System.out.println("Opcion no valida intente nuevamente");
                                System.out.println("");
                                x = false;
                                break;
                        }
                    } while (!x);
                    int dano = (r.nextInt(5)+1)*100;
                    System.out.println("El dano de tu babosa sera de : "+dano);
                    int vida = 100;
                    System.out.println("");
                    System.out.println("La vida de tu babosa es de "+vida);
                    bab.setName(nombre);
                    bab.setElemento(elemento);
                    bab.setDano(dano);
                    bab.setVida(vida);
                    System.out.println("");
                    System.out.println("La informacion de tu babosa es la siguente : ");
                    System.out.println(bab);
                    babo.add(bab);
                    
                    break;
                case 2:
                    System.out.println("----Inventario de babosas----");
                    System.out.println("");
                    for (int i = 0; i < babo.size(); i++) {
                        System.out.println("Babosa "+i+" : ");
                        System.out.println(babo.get(i));
                        System.out.println("");
                    }
                    System.out.println("Recordatorio : si una de las babosas que buscas no esta aqui, posiblemente este en la mochila.");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("----Agregar babosas a la mochila----");
                    System.out.println("");
                    if (mochila.size()<5) {
                        if (babo.size()>0) {
                            System.out.println("Tu inventario de babosas es el siguente : ");
                            System.out.println("");
                            for (int i = 0; i < babo.size(); i++) {
                                System.out.println("Babosa "+i+" : ");
                                System.out.println(babo.get(i));
                                System.out.println("");
                            }
                            System.out.println("Que babosa deseas agregar a la mochila ");
                            System.out.print("Babosa : ");
                            while (!entrada.hasNextInt()) {
                                    System.out.println("¡Error! Debes de ingresar el numero de la babosa que deseas adicionar a la mochila");
                                    entrada.next();
                                    System.out.println("");
                                    System.out.print("Babosa : ");
                            }
                            int b = entrada.nextInt();
                            boolean y = false;
                            do {
                                if (b<babo.size()&&b>=0) {
                                    y=true;
                                }else{
                                    System.out.println("La babosa tiene que estar dentro de el rango de opciones : ");
                                    System.out.println("Babosa : ");
                                    while (!entrada.hasNextInt()) {
                                        System.out.println("¡Error! Debes de ingresar el numero de la babosa que deseas adicionar a la mochila");
                                        entrada.next();
                                        System.out.println("");
                                        System.out.print("Babosa : ");
                                    }
                                    b = entrada.nextInt();
                                    y=false;
                                }
                            } while (!y);
                            System.out.println("Su babosa elegida fue :");
                            System.out.println(babo.get(b));
                            mochila.add(babo.get(b));
                            babo.remove(b);
                            System.out.println("");
                            System.out.println("Su babosa se adiciono a la mochila con exito ! ! !");
                        }else{
                            System.out.println("Debes de agregar babosas en la opcion 1 para poder agregar a la mochila");
                        }
                    }else{
                        System.out.println("");
                        System.out.println("----MOCHILA LLENA----");
                        System.out.println("Si quieres remover una de las babosas ve a la opcion mochila");
                    }
                    break;
                case 4:
                    System.out.println("----Mochila----");
                    System.out.println("");
                    for (int i = 0; i < mochila.size(); i++) {
                        System.out.println("Babosa "+i+" : ");
                        System.out.println(mochila.get(i));
                        System.out.println("");
                    }
                    
                    System.out.println("Deseas quitar una de las babosas de la mochila?");
                    System.out.println("1) Si\n2) No");
                    System.out.print("Opcion : ");
                    while (!entrada.hasNextInt()) {
                        System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                        entrada.next();
                        System.out.print("Opcion : ");
                    }
                    int op = entrada.nextInt();
                    switch(op){
                        case 1:
                            System.out.println("Ingresa la babosa que deseas remover");
                            System.out.println("Babosa : ");
                            while (!entrada.hasNextInt()) {
                                System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                                entrada.next();
                                System.out.print("Opcion : ");
                            }
                            int ba = entrada.nextInt();
                            boolean q = false;
                            do {
                                if (ba<mochila.size()&&ba>=0) {
                                    q=true;
                                }else{
                                    System.out.println("La babosa tiene que estar dentro de el rango de opciones : ");
                                    System.out.println("Babosa : ");
                                    ba = entrada.nextInt();
                                    q=false;
                                }
                            } while (!q);
                            System.out.println("Su babosa elegida fue :");
                            System.out.println(mochila.get(ba));
                            babo.add(mochila.get(ba));
                            mochila.remove(ba);
                            System.out.println("");
                            System.out.println("Su babosa se retiro de la mochila con exito ! ! !");
                            break;
                        case 2:
                            System.out.println("Saliendo de este apartado...");
                            break;
                        default:
                            System.out.println("Opcion no valida intente nuevamente");
                            
                    }
                    break;
                case 5:
                    System.out.println("----Crear enemigo----");
                    enemigo ene = new enemigo();
                    System.out.println("");
                    System.out.println("Ingrese el nombre del enemigo : ");
                    entrada.nextLine();
                    String name = entrada.nextLine();
                    System.out.println("");
                    boolean z = false;
                    int vid=0;
                    int da=0;
                    do {
                        System.out.print("Ingrese nivel de dificultad del enemigo (1-5) : ");
                        while (!entrada.hasNextInt()) {
                            System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                            entrada.next();
                            System.out.print("Ingrese nivel de dificultad del enemigo (1-5):");
                        }
                        int nivel = entrada.nextInt();
                        
                        switch(nivel){
                            case 1:
                                vid = 200;
                                da = 10;
                                z = true;
                                break;
                            case 2:
                                vid = 600;
                                da = 20;
                                z = true;
                                break;
                            case 3:
                                vid = 1000;
                                da = 30;
                                z = true;
                                break;
                            case 4:
                                vid = 1500;
                                da = 40;
                                z = true;
                                break;
                            case 5:
                                vid = 2000;
                                da = 50;
                                z = true;
                                break;
                            default:
                                System.out.println("Opcion no valida intente nuevamente.");
                                z = false;
                        }  
                    } while (!z);
                    ene.setName(name);
                    ene.setDano(da);
                    ene.setVida(vid);
                    System.out.println("");
                    System.out.println("Informacion del enemigo :");
                    System.out.println(ene);
                    enem.add(ene);
                    System.out.println("");
                    
                    break;
                case 6:
                    System.out.println("----Lista de enemigos----");
                    System.out.println("");
                    for (int i = 0; i < enem.size(); i++) {
                        System.out.println("Enemigo "+i+" : ");
                        System.out.println(enem.get(i));
                        System.out.println("");
                        
                    }
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("----Simulador----");
                    if (enem.size()>0&&mochila.size()==5) {
                        System.out.println("");
                        System.out.println("Lista de enemigos : ");
                        System.out.println("");
                        for (int i = 0; i < enem.size(); i++) {
                            System.out.println("Enemigo "+i+" : ");
                            System.out.println(enem.get(i));
                            System.out.println("");
                        }
                        System.out.println("Eliga el enemigo contra el que desea enfrentarse");
                        System.out.print("Enemigo : ");
                        while (!entrada.hasNextInt()) {
                                System.out.println("¡Error! Debe ingresar un número, y que sea uno dentro de las opciones.");
                                entrada.next();
                                System.out.print("Enemigo : ");
                        }
                        int enemigo = entrada.nextInt();
                        boolean l = false;
                        do {
                            if (enemigo<enem.size()&&enemigo>=0) {
                                l = true;
                            }else{
                                System.out.println("Su opcion tiene que estar dentro del rango de opciones.");
                                System.out.println("Enemigo : ");
                                enemigo = entrada.nextInt();
                                l=false;
                            }
                        } while (!l);
                        System.out.println("");
                        System.out.println("El enemigo que eligio para el combate es : ");
                        System.out.println(enem.get(enemigo));
                        
                        System.out.println("");
                        
                        
                        
                    }else{
                        System.out.println("Tienes que contar con almenos un enemigo y 5 babosas en la mochila para poder utilizar el simulador");
                        System.out.println("Cantidad de babosas = "+mochila.size());
                        System.out.println("Cantidad de enemigos = "+enem.size());
                        System.out.println("");
                    }
                    
                    
                    
                    break;
                case 8:
                    System.out.println("Saliendo del juego....");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente.");
                    break;
            }
        } while (resp!=8);
    }
    
}
