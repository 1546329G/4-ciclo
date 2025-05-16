/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.pkg1;
import java.util.Scanner;

/**
 *
 * @author GANDY
 */
//1.Implementa una función recursiva que calcule la suma 
//de los primeros n números naturales.

public class SumaRecursiva {
    public static int suma(int n) {
        if (n == 0) {
            return 0;
        }
        return n + suma(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("La suma de los primeros " + numero + " números naturales es: " + suma(numero));
        scanner.close();
    }
}


