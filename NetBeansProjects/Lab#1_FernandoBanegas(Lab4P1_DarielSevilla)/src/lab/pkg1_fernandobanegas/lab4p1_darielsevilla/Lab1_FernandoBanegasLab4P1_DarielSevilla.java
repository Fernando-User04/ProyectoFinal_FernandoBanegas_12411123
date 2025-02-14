/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg1_fernandobanegas.lab4p1_darielsevilla;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Lab1_FernandoBanegasLab4P1_DarielSevilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int resp = 1;
        do {
            System.out.println("-----Menu de Ejercicios Lab 4-----");
            System.out.println("Eliga uno de los ejercicios a continuacion");
            System.out.println("1-Orden de compras");
            System.out.println("2-Similitud de Peticiones");
            System.out.println("3-Es una rotacion?");
            System.out.println("4-Salir");
            System.out.print("Ejercicio : ");
            resp = entrada.nextInt();
            switch (resp){
                case 1:
                    System.out.println("Ingrese la palabra magica : ");
                    String cadena = entrada.next();
                    compra(cadena);
                    break;
                case 2:
                    System.out.print("Ingrese primera peticion: ");
                    entrada.nextLine();
                    String peticion1 = entrada.nextLine();
                    System.out.print("Ingrese segunda peticion: ");
                    String peticion2 = entrada.nextLine();

                    String similitudAlterada = obtenerSimilitud(peticion1, peticion2);
                    int letras = 0;
                    int asteriscos = 0;
                    for (int i = 0; i < similitudAlterada.length(); i++) {
                        char c = similitudAlterada.charAt(i);
                        if (Character.isLetter(c)) {
                            letras++;
                        } else if (c == '*') {
                            asteriscos++;
                        }
                    }
                    double similitud = (double) letras / (letras + asteriscos);
                    System.out.println("Similitudes de la segunda peticion: " + similitudAlterada);
                    System.out.println("Las peticiones tienen un parecido de " +similitud);
                    
                    System.out.println("");


                    
                    break;
                case 3:
                    System.out.println("Ingrese la cadena de prueba :");
                    String c1 = entrada.next();
                    System.out.println("Ingrese la cadena resultante del hechizo :");
                    String c2 = entrada.next();
                    boolean c = hechizo(c1,c2);
                    if (c){
                        System.out.println("El hechizo ha funcionado! La cadena se ha rotado");
                    }else{
                        System.out.println("El hechizo fue un fracaso, a la otra sera");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el programa, suerte con la granja");
                    resp=4;
                    break;
                default:
                    System.out.println("No esta dentro de las opciones porfavor vuelva a ingresar el ejercicio que desea realizar");
                    break;
                    
            }
            
            
        }while (resp != 4);
    }
    
    
    public static boolean hechizo(String a, String b){
        if (a.length()!=b.length()){
            System.out.println("No tiene la misma cantidad de caracteres");
            return false;
        }else{
        String dupli = b+b;
        return dupli.contains(a);
        }
        
    }
    
    public static void compra(String a){
        int papa = 0;
        int maiz = 0;
        int trigo = 0;
        int cafe = 0;
        int otros = 0;
        int can = 0;
    for (int cont=0;cont<a.length();cont++){
        char i = a.charAt(cont);
        if 
        (Character.isDigit(i)){
            can = Character.getNumericValue(i);
        }else{
            switch (i){
                case 'p':
                    papa += can;
                    break;
                case 'm':
                    maiz += can;
                    break;
                case 't':
                    trigo+= can;
                    break;
                case 'c':
                    cafe += can;
                    break;
                default:
                    otros += can;
                    break;
            
            }
        }
        
        
    }
        System.out.println("Orden Final : ");
        System.out.println("");
        System.out.println("Maiz x"+maiz);
        System.out.println("Papa x"+papa);
        System.out.println("Trigo x"+trigo);
        System.out.println("Cafe x"+cafe);
        System.out.println("Otros x"+otros);
        System.out.println("");
        System.out.println("");
        
    }
    
    public static String obtenerSimilitud(String peticion1, String peticion2) {
        peticion1 = peticion1.toLowerCase();
        peticion2 = peticion2.toLowerCase();
        String resultado = "";
        String palabra = "";
        for (int i = 0; i <= peticion2.length(); i++) {
            if (i == peticion2.length() || peticion2.charAt(i) == ' ') {
                if (!palabra.isEmpty()) {
                    if (contienePalabra(peticion1, palabra)) {
                        resultado += palabra;
                    } else {
                        for (int j = 0; j < palabra.length(); j++) {
                            resultado += "*";
                        }
                    }
                    resultado += " ";
                    palabra = ""; 
                }
            } else {
                palabra += peticion2.charAt(i);
            }
        }
        return resultado.trim();
    }
    
     public static boolean contienePalabra(String base, String palabra) {
        String palabraBase = "";
        for (int i = 0; i <= base.length(); i++) {
            if (i == base.length() || base.charAt(i) == ' ') {
                if (!palabraBase.isEmpty()) {
                    if (palabraBase.equals(palabra)) {
                        return true;
                    }
                    palabraBase = "";
                }
            } else {
                palabraBase += base.charAt(i);
            }
        }

        return false;
    }


        
         
            
                
        
    
}
