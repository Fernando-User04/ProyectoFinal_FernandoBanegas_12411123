/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_presentacion_12411123;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class Proyecto_Presentacion_12411123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        mpres leer = new mpres();
        Random r = new Random();
        System.out.println("----Bienvenido a la Pizzeria los Lirios----");
        System.out.println("Usted es el nuevo supervisor de reparticion de la pizzeria.\nUsted debera hacer las asignaciones "
                + "de los pedidos.\nUsted decide cuantas rondas va a desear trabajar.");
        System.out.println("");
        System.out.println("Nosotros contamos con 3 repartidores los cuales son : \n1) Sadith Ramos\n2) Andy Zuniga\n3) Jostin Castro");
        System.out.println("");
        System.out.println("-------------------------------");
        int resp = 0;
        do{
            System.out.println("Desea trabajar ? ");
            System.out.println("1) Si");
            System.out.println("2) No");
            System.out.print("Opcion : ");
            resp = entrada.nextInt();
            switch(resp){
                case 1 : 
                    System.out.println("----Comienza la jornada----");
                    repartidor []rep = new repartidor[3];
                    for (int i = 0; i < 3; i++) {
                        rep[i]=new repartidor();
                        System.out.print("Nombre del cliente (Ingrese solo el primer nombre): ");
                        String nombre = entrada.next();
                        rep[i].setNombrec(nombre);
                        System.out.println("");
                        int p = 0;
                            System.out.println("A continuacion "+nombre+" eligira una de las opciones del menu");
                            System.out.println("----Menu----");
                            System.out.println("1) Pizza de peperoni (100lmp) ");
                            System.out.println("2) Pizza de jamon (120lmp)");
                            System.out.println("3) Pizza de carnes (140lmp)");
                            System.out.println("4) Pizza vegetariana (90lmp)");
                            p = r.nextInt(4)+1;  
                            switch(p){
                                case 1: 
                                    rep[i].setPizza("Pizza de peperoni");
                                    rep[i].setPrice(100);
                                    break;
                                case 2: 
                                    rep[i].setPizza("Pizza de Jamon");
                                    rep[i].setPrice(120);
                                    break;
                                case 3:
                                    rep[i].setPizza("Pizza de Carnes");
                                    rep[i].setPrice(140);
                                    break;
                                default:
                                    rep[i].setPizza("Pizza Vegetariana");
                                    rep[i].setPrice(90);
                                    break;
                            }
                            System.out.println("----------------");
                            System.out.println("La pizza elegida por el cliente fue : "+rep[i].getPizza());
                            System.out.println("");
                            System.out.println("----------------");
                            System.out.println("");
                    }
                            System.out.println("Las distancias de los clientes son las siguentes : ");
                            System.out.println("");
                            for (int j = 0; j < 3; j++) {
                            int dis = r.nextInt(50)+1;
                            rep[j].setDistancia(dis);
                            System.out.println("La distancia de "+rep[j].getNombrec()+" es de "+rep[j].getDistancia()+"km");
                            System.out.println("");
                            }
                        System.out.println("----------------");
                        System.out.println("----Asignacion de Repartidores----");
                        System.out.println("");
                        System.out.println("Repartidores Disponibles : ");
                        System.out.println("");
                        System.out.println("1) Sadith Ramos\n\n2) Andy Zuniga\n\n3) Jostin Castro");
                        System.out.println("----------------");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Cliente "+(i+1)+" : "+rep[i].getNombrec());
                            int partidor = 0;
                            System.out.println("");
                            do{
                                System.out.print("Repartidor (Se puede repetir): ");
                                partidor = entrada.nextInt();
                                System.out.println("");
                                switch(partidor){
                                    case 1:
                                        rep[i].setNombrer("Sadith Ramos");
                                        break;
                                    case 2:
                                        rep[i].setNombrer("Andy Zuniga");
                                        break;
                                    case 3:
                                        rep[i].setNombrer("Jostin Castro");
                                        break;
                                    default:
                                        System.out.println("Opcion no valida, intente nuevamente");
                                        break;
                                }
                            }while(partidor>3);
                            System.out.println("");
                        }
                        System.out.println("");
                        System.out.println("----------------");
                        System.out.println("La asignacion queda de la siguente manera : ");
                        System.out.println("");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Cliente "+(i+1)+" : "+rep[i].getNombrec()+"---"+rep[i].getNombrer());
                            System.out.println("");
                        }
                        
                        System.out.println("");
                        System.out.println("Vamos a regresar los precios con su debido impuesto (el impuesto es del 15% : )" );
                        System.out.println("");
                        for (int i = 0; i < 3; i++) {
                            rep[i].setPrice(leer.pago_total(rep[i].getPrice()));
                            System.out.println("El pago con impuesto del Cliente "+(i+1)+" ( "+rep[i].getNombrec()+" ) es de : "
                            +rep[i].getPrice());
                            System.out.println("");
                    }
                        System.out.println("");
                        System.out.println("------------------");
                        System.out.println("");
                        
                        System.out.println("Vamos a sacar tambien el tiempo estimado para cada pedido (teniendo en cuenta "
                                + "que cada repartidor tiene una velocidad de 40 km/h) : ");
                        System.out.println("");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("El tiempo estimado de el pedido #"+(i+1)+" es de : "+(leer.tiempo_estimado(rep[i].getDistancia()))+" minutos");
                            rep[i].setTiempo(leer.tiempo_estimado(rep[i].getDistancia()));
                            System.out.println("");
                    }
                        
                        System.out.println("");
                        System.out.println("------------------");
                        System.out.println("");
                        System.out.println("Los pedidos de esta ronda quedan de la siguente forma : ");
                        System.out.println("");
                        for (int i = 0; i < 3; i++) {
                            System.out.println("Cliente #"+(i+1)+" : ");
                            System.out.println("Nombre del Cliente : "+rep[i].getNombrec());
                            System.out.println("Distancia del Cliente : "+rep[i].getDistancia()+" km");
                            System.out.println("Tiempo estimado de la entrega : "+rep[i].getTiempo()+" minutos");
                            System.out.println("Repartidor : "+rep[i].getNombrer());
                            System.out.println("Pago total : "+rep[i].getPrice()+ " lmps");
                            System.out.println("");
                            
                        
                    }
                        
                        System.out.println("Ronda Terminada con exito, si desea pueder trabajar otra ronda.");
                        
                        
                        
                        
                    break;
                case 2:
                    System.out.println("Descansamos por hoy...");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
            }
        }while(resp!=2);
    }
    
    
}
