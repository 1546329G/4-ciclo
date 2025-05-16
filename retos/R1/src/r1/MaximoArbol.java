/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r1;
import java.util.Scanner;

/**
 *
 * @author GANDY
 */

//1.Crea una función recursiva para encontrar 
//el número máximo en un árbol binario.


class Nodo {
    int valor;
    Nodo izquierdo;
    Nodo derecho;

    Nodo(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}

public class MaximoArbol {
    public static int encontrarMaximo(Nodo nodo) {
        if (nodo == null) return Integer.MIN_VALUE;
        int maxIzquierdo = encontrarMaximo(nodo.izquierdo);
        int maxDerecho = encontrarMaximo(nodo.derecho);
        return Math.max(nodo.valor, Math.max(maxIzquierdo, maxDerecho));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nodo raiz = new Nodo(17);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(25);
        raiz.izquierdo.izquierdo = new Nodo(3);
        raiz.izquierdo.derecho = new Nodo(7);
        raiz.derecho.izquierdo = new Nodo(12);
        raiz.derecho.derecho = new Nodo(28);
        System.out.println(" valor máximo en el arbol es: " + encontrarMaximo(raiz));
        scanner.close();
    }
}

