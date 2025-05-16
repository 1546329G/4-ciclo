/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2;
import java.util.Scanner;

/**
 *
 * @author GANDY
 */
import java.util.Scanner;

//2:Define un árbol binario con los valores 20, 10, 30.
//Impleméntalo y muestra la raíz.

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

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario(int valorRaiz) {
        this.raiz = new Nodo(valorRaiz);
    }

    public void agregarIzquierdo(Nodo nodoPadre, int valor) {
        nodoPadre.izquierdo = new Nodo(valor);
    }

    public void agregarDerecho(Nodo nodoPadre, int valor) {
        nodoPadre.derecho = new Nodo(valor);
    }

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario(20);
        arbol.agregarIzquierdo(arbol.raiz, 10);
        arbol.agregarDerecho(arbol.raiz, 30);
        System.out.println("La raiiz del árbol se : " + arbol.raiz.valor);
    }
}

