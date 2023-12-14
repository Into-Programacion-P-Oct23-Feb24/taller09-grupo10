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
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan",
            "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning",
            "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        // Inciamos el ciclo for
        for (int i = 0; i < promedios.length; i++) {
            // utilizamos un if para poiner un rango para poder identificar los
            //buenos y malos promedios 
            // notas,
            if ((promedios[i] >= 0) && (promedios[i] <= 5.9)) {
                promediosCualitativos[i] = "Regular";
            } else {
                // segun el rango utilizamos un arreglo para ver si son buenos 
                //o malos promedios 
                if ((promedios[i] >= 6) && (promedios[i] <= 8.9)) {
                    promediosCualitativos[i] = "Bueno";
                } else {
                    if ((promedios[i] >= 9) && (promedios[i] <= 10)) {
                        promediosCualitativos[i] = "Sobresaliente";
                    }
                }
            }
        }
        // presentamos con un ciclo for 
        for (int i = 0; i < promedios.length; i++) {
            System.out.printf("%s promedio: %.2f promedio cualitativo %s\n",
                    estudiantes[i],
                    promedios[i],
                    promediosCualitativos[i]);
        }
    }
}
