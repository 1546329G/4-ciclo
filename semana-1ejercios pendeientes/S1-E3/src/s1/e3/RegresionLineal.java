/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s1.e3;
import java.util.Arrays;


/**
 *
 * @author GANDY
 */

public class RegresionLineal {
    public static void main(String[] args) {
        double[] alturas = {150, 160, 170, 180, 190};
        double a = 0.9; // Pendiente (coeficente de la regresion)
        double b = -60; // Intersección (valor constante)

        System.out.println("Predicción de peso según altura:");
        for (double altura : alturas) {
            double peso = a * altura + b;
            System.out.println("Altura: " + altura + " cm -> Peso estimado: " + peso + " kg");
        }
    }
}
