/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 * Genera una aplicación que permita ingresar valores a un arreglo de cadenas.
 * El arreglo almacena el número de elementos que el usuario lo disponga. Se
 * puede plantear el escenario que se ingresen nombres de marcas de vehículos.
 *
 * Por ejemplo, si el usuario decide ingresar 5 marcas; el arreglo solo debe
 * permitir ingresar ese número elementos.
 *
 * Considerar las siguientes excepciones, no se contabilizan dentro del número
 * de elementos, marcas que empiecen con las letras A, C, T.
 *
 * @author reroes
 */
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        // Se declaran las variables
        int n;
        String marca = "";
        String inicial;
        String[] arreglo;
        // Se pide al usuario ingresar la cantidad de marcas que se va a guardar
        System.out.println("Ingrese la cantidad de marcas a guardar");
        n = entrada.nextInt();
        // Dar el valor que ingreso el usuario al indice del arreglo
        arreglo = new String[n];
        entrada.nextLine();

        // Realizar un ciclo repetitivo para pedir las marcas al usuario
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la marca");
            marca = entrada.nextLine();
            // Tomar la inicial de la marca que ingreso el usuario para comparar
            inicial = marca.substring(0, 1).toUpperCase();
            // Se compara la inicial y se disminuye el ciclo hasta tener 5
            // marcas validas
            if (inicial.equals("A") || inicial.equals("C") || inicial.equals("T")) {
                --i;
                System.out.println("Ingrese una marca diferente a A, C, T");
            } else {
                arreglo[i] = marca;
            }
        }

        // Presentar las marcas en consola
        System.out.println("Marcas Ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
