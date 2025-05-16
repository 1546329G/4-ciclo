/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e5;
import java.util.Scanner;
/**
 *
 * @author GANDY
 */
//5.Haz un recorrido post-order en un árbol
//con los valores 10, 5, 15.
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
public class PostOrderTraversal {
    public static void postOrder(Nodo nodo) {
        if (nodo == null) return;
        postOrder(nodo.izquierdo);
        postOrder(nodo.derecho);
        System.out.print(nodo.valor + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nodo raiz = new Nodo(10);
        raiz.izquierdo = new Nodo(5);
        raiz.derecho = new Nodo(15);
        System.out.println("Recorrido Post-order:");
        postOrder(raiz);
        scanner.close();
    }
}
