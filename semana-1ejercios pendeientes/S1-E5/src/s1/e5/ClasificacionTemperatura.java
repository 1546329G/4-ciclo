/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s1.e5;
import java.util.Arrays;

/**
 *
 * @author GANDY
 */

//5.Realiza una clasificación multiclase para determinar si
//una temperatura es "Fría", "Moderada" o "Caliente".

public class ClasificacionTemperatura {
    public static void main(String[] args) {
        // Datos de temperaturas en °C
        double[] temperaturas = {10.5, 15.0, 22.3, 30.1, 35.7};

        System.out.println("Clasificación de temperaturas:");
        for (double temp : temperaturas) {
            if (temp < 15) {
                System.out.println("Temperatura " + temp + ": Fría");
            } else if (temp <= 30) {
                System.out.println("Temperatura " + temp + ": Moderada");
            } else {
                System.out.println("Temperatura " + temp + ": Caliente");
            }
        }
    }
}
