/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package r2;
import java.util.Scanner;

/**
 *
 * @author GANDY
 */

//2.Implementa un árbol binario con al menos 7 nodos
//y realiza un recorrido pre-order.
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

public class ArbolBinarioCompleto {
    Nodo raiz;

    public ArbolBinarioCompleto(int valorRaiz) {
        this.raiz = new Nodo(valorRaiz);
    }

    public void agregarIzquierdo(Nodo nodoPadre, int valor) {
        nodoPadre.izquierdo = new Nodo(valor);
    }

    public void agregarDerecho(Nodo nodoPadre, int valor) {
        nodoPadre.derecho = new Nodo(valor);
    }

    public static void preOrder(Nodo nodo) {
        if (nodo == null) return;
        System.out.print(nodo.valor + " ");
        preOrder(nodo.izquierdo);
        preOrder(nodo.derecho);
    }

    public static void main(String[] args) {
        ArbolBinarioCompleto arbol = new ArbolBinarioCompleto(10);
        arbol.agregarIzquierdo(arbol.raiz, 5);
        arbol.agregarDerecho(arbol.raiz, 15);
        arbol.agregarIzquierdo(arbol.raiz.izquierdo, 3);
        arbol.agregarDerecho(arbol.raiz.izquierdo, 7);
        arbol.agregarIzquierdo(arbol.raiz.derecho, 12);
        arbol.agregarDerecho(arbol.raiz.derecho, 18);
        System.out.println("recorrido Pre-order:");
        preOrder(arbol.raiz);
    }
}
