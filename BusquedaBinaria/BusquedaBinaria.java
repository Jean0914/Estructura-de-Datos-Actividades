/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedabinaria;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author cjean
 */

public class BusquedaBinaria{

    public static void main(String[] args) {
        int[] numeros = generarNumerosOrdenados(1000);
        int numeroABuscar = numeros[new Random().nextInt(1000)]; // Selecciona un número aleatorio para buscar

        System.out.println("Los Numeros han sido generados y ordenados: " + Arrays.toString(numeros));
        System.out.println("Numero a buscar: " + numeroABuscar);

        int indice = buscarNumero(numeros, numeroABuscar);
        if (indice != -1) {
            System.out.println("El numero " + numeroABuscar + " se encuentra en la posicion " + indice);
        } else {
            System.out.println("El numero " + numeroABuscar + " no se encuentra en la lista.");
        }
    }

    public static int[] generarNumerosOrdenados(int cantidad) {
        int[] numeros = new int[cantidad];
        Random rand = new Random();

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = rand.nextInt(10000)+1; // Genera números aleatorios entre 0 y 9999
        }

        Arrays.sort(numeros); // Ordena los números en orden ascendente

        return numeros;
    }

    public static int buscarNumero(int[] numeros, int numero) {
        int izquierda = 0;
        int derecha = numeros.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (numeros[medio] == numero) {
                return medio;
            }

            if (numeros[medio] < numero) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }

        return -1;
    }
}
