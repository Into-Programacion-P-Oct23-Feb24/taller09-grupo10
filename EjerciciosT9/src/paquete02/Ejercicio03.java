/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar variables
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double promedio = 0;
        String[] rango = {"arriba", "abajo"};
        int[] numRango = {0, 0};
        double suma=0;
       // Sumar todos los valores de arreglo y guardarlos en promedio
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        // Conseguir el promedio dividiendo por la cantidad de elentos en el arreglo
        promedio = suma / arreglo.length;
        // Identificar si esta arriba de la media aritmetica o abajo de la media
        for (int i = 0; i < arreglo.length; i++) {
            // Comparar si el promedio esta arriba de la media
            if (arreglo[i]>promedio) {
                numRango[0] += 1;
            } else {
                // Comparar si el promedio esta debajo de la media
                if (arreglo[i]<promedio ) {
                    numRango[1] += 1;
                }
            }
        }
        // Presenta los rangos
        for (int i = 0; i < rango.length; i++) {
            System.out.printf("Rango %s - valor %d\n", rango[i],
                    numRango[i]);
        }

    }

}
