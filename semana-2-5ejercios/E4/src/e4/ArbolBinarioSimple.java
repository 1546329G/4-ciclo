/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e4;
import java.util.Scanner;
/**
 *
 * @author GANDY
 */

//4.Implementa un árbol binario con un nodo raíz y dos hijos.
//Imprime sus valores.

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

public class ArbolBinarioSimple {
    Nodo raiz;

    public ArbolBinarioSimple(int valorRaiz) {
        this.raiz = new Nodo(valorRaiz);
    }
    public void agregarIzquierdo(int valor) {
        this.raiz.izquierdo = new Nodo(valor);
    }
    public void agregarDerecho(int valor) {
        this.raiz.derecho = new Nodo(valor);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("pon el valor de la raíz: ");
        int valorRaiz = scanner.nextInt();
        ArbolBinarioSimple arbol = new ArbolBinarioSimple(valorRaiz);

        System.out.print("pon el valor del hijo izquierdo: ");
        int valorIzquierdo = scanner.nextInt();
        arbol.agregarIzquierdo(valorIzquierdo);

        System.out.print("pon del hijo derecho: ");
        int valorDerecho = scanner.nextInt();
        arbol.agregarDerecho(valorDerecho);

        System.out.println("Valores del árbol: " + arbol.raiz.valor + ", " + arbol.raiz.izquierdo.valor + ", " + arbol.raiz.derecho.valor);
        scanner.close();
    }
}
