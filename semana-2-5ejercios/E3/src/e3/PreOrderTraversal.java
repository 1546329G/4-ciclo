/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3;
import java.util.Scanner;

/**
 *
 * @author GANDY
 */
//3.Realiza un recorrido pre-order en un árbol con los 
//valores 50, 25, 75.
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

public class PreOrderTraversal {
    public static void preOrder(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        preOrder(nodo.izquierdo);
        preOrder(nodo.derecho);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nodo raiz = new Nodo(50);
        raiz.izquierdo = new Nodo(25);
        raiz.derecho = new Nodo(75);
        System.out.println("el ecorrido dee Pre-order:");
        preOrder(raiz);
        scanner.close();
    }
}
