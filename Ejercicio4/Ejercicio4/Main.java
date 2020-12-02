package Ejercicio4;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Main metodo = new Main();
    Clase p = new Clase();
    Clase p2 = new Clase();
    Scanner V = new Scanner(System.in);
    boolean X= true;
    int dato;
    
    while(X) {
       System.out.println("-----MENU-----");
        System.out.println("Metodo de una pila");
        System.out.println("[1]insertar");
        System.out.println("[2]sacar");
        System.out.println("[3]mostrar cima");
        System.out.println("[4]mostrar si la pila esta vacia");
        System.out.println("[5]mostrar pila");
        System.out.println( "[6]Mostrar tamaño de la pila");
        System.out.println("[7]salir");
        int opc = V.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese un numero entero");
                dato = V.nextInt();
                metodo.insertar(p, p2, dato);
                break;
            case 2:
                if (!p.EstaVacia()) {
                    System.out.println("Numero elimidado: " + p.eliminar());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            case 3:
                if (!p.EstaVacia()) {
                    System.out.println("Cima de la pila: " + p.cima());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            
            case 4:
                if (p.EstaVacia()) {
                    System.out.println("La pila esta vacia");
                } else {
                    System.out.println("La pila tiene " + p.tam());
                }
                break;
            case 5:
                if (!p.EstaVacia()) {
                    System.out.println("Pila 1: ");
                    p.MostrarPila();
                    System.out.println("\nPila 2: ");
                    p2.MostrarPila();
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            case 6:
                System.out.println("Tamaño de la pila: " + p.tam());
                break;
            case 7:
                X= false;
                break;
            default:
                System.out.println("Opcion no valida");
        }
       
    } 
}

public void NumerosRandom(Clase p, Clase p2) {
    for (int i = 0; i < 10; i++) {
        int ram = ((int) (Math.random() * 500) + 50);
        insertar(p, p2, ram);
    }
}

public void insertar(Clase p, Clase p2, int d) {
    if (p.EstaVacia()) {
        p.Agregar(d);
    } else {
        int cima = p.eliminar();
        if (d >= cima) {
            p.Agregar(cima);
            p.Agregar(d);
        } else {
            p.Agregar(cima);
            p2.Agregar(d);
        }
    }
}
}
