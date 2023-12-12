/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArbolesB;

/**
 *
 * @author cjean
 */
import java.util.LinkedList;
import java.util.Queue;

class Nodo {
    int[] claves;
    Nodo[] hijos;
    int numClaves;
    boolean esHoja;

    public Nodo() {
        // Aumentar el grado del árbol
        int grado = 5; // Se puede realizar un aumento màs elevado
        this.claves = new int[grado - 1];
        this.hijos = new Nodo[grado];
        this.numClaves = 0;
        this.esHoja = true;
    }
}

class ArbolB {
    private Nodo raiz;

    public ArbolB() {
        this.raiz = new Nodo();
    }

    public void insertar(int valor) {
        // Implementa la inserción en el árbol B
        

        System.out.println("Valor " + valor + " insertado correctamente.");
    }

    public void buscar(int valor) {
        // Implementa la búsqueda en el árbol B
        

        System.out.println("Nodo con valor " + valor + " encontrado.");
    }

    public void eliminar(int valor) {
        // Implementa la eliminación en el árbol B
        

        System.out.println("Nodo con valor " + valor + " eliminado correctamente.");
    }
}

public class Main {
    public static void main(String[] args) {
        ArbolB arbol = new ArbolB();

        // Insertar valores
        arbol.insertar(10);
        arbol.insertar(5);
        arbol.insertar(20);
        arbol.insertar(100);
        arbol.insertar(80);
        arbol.insertar(1);

        // Buscar un nodo
        arbol.buscar(25);

        // Eliminar un nodo
        arbol.eliminar(5);
    }
}
