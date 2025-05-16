/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s1.e4;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author GANDY
 */

public class ClusteringTresGrupos {
    public static void main(String[] args) {
        int[] datos = {10, 25, 40, 55, 70, 85, 100};

        List<Integer> cluster1 = new ArrayList<>();
        List<Integer> cluster2 = new ArrayList<>();
        List<Integer> cluster3 = new ArrayList<>();

        int threshold1 = 40;
        int threshold2 = 80;
        for (int dato : datos) {
            if (dato <= threshold1) {
                cluster1.add(dato);
            } else if (dato <= threshold2) {
                cluster2.add(dato);
            } else {
                cluster3.add(dato);
            }
        }

        System.out.println("Cluster 1: " + cluster1);
        System.out.println("Cluster 2: " + cluster2);
        System.out.println("Cluster 3: " + cluster3);
    }
}
