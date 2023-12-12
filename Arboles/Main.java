import java.util.ArrayList;
import java.util.List;

class Nodo {
    int valor;
    List<Nodo> hijos;

    public Nodo(int valor) {
        this.valor = valor;
        this.hijos = new ArrayList<>();
    }
}

class ArbolGeneral {
    Nodo raiz;

    public ArbolGeneral(Nodo raiz) {
        this.raiz = raiz;
    }

    public void recorridoPreorden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + " ");
            for (Nodo hijo : nodo.hijos) {
                recorridoPreorden(hijo);
            }
        }
    }

    public void recorridoInorden(Nodo nodo) {
        if (nodo != null) {
            for (Nodo hijo : nodo.hijos) {
                recorridoInorden(hijo);
                System.out.print(nodo.valor + " ");
            }
        }
    }

    public void recorridoPostorden(Nodo nodo) {
        if (nodo != null) {
            for (Nodo hijo : nodo.hijos) {
                recorridoPostorden(hijo);
            }
            System.out.print(nodo.valor + " ");
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public int obtenerAltura(Nodo nodo) {
        if (nodo == null) {
            return 0;
        } else {
            int alturaMax = 0;
            for (Nodo hijo : nodo.hijos) {
                int alturaHijo = obtenerAltura(hijo);
                if (alturaHijo > alturaMax) {
                    alturaMax = alturaHijo;
                }
            }
            return 1 + alturaMax;
        }
    }

    public void imprimirSubArbol(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.valor + ": ");
            for (Nodo hijo : nodo.hijos) {
                System.out.print(hijo.valor + " ");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Nodo raiz = new Nodo(1);
        Nodo hijo1 = new Nodo(2);
        Nodo hijo2 = new Nodo(3);
        Nodo nieto1 = new Nodo(4);
        Nodo nieto2 = new Nodo(5);

        raiz.hijos.add(hijo1);
        raiz.hijos.add(hijo2);
        hijo1.hijos.add(nieto1);
        hijo1.hijos.add(nieto2);

        ArbolGeneral arbolGeneral = new ArbolGeneral(raiz);

        // Imprimir árbol general
        System.out.println("Recorrido Preorden:");
        arbolGeneral.recorridoPreorden(raiz);
        System.out.println("\nRecorrido Inorden:");
        arbolGeneral.recorridoInorden(raiz);
        System.out.println("\nRecorrido Postorden:");
        arbolGeneral.recorridoPostorden(raiz);

        // Convertir a árbol binario y mostrar recorridos
        Nodo raizBinario = convertirABinario(raiz);
        ArbolGeneral arbolBinario = new ArbolGeneral(raizBinario);

        System.out.println("\n\nRecorrido Preorden Árbol Binario:");
        arbolBinario.recorridoPreorden(raizBinario);
        System.out.println("\nRecorrido Inorden Árbol Binario:");
        arbolBinario.recorridoInorden(raizBinario);
        System.out.println("\nRecorrido Postorden Árbol Binario:");
        arbolBinario.recorridoPostorden(raizBinario);

        // Otros métodos
        System.out.println("\n\n¿Árbol binario está vacío? " + arbolBinario.estaVacio());
        System.out.println("Altura del árbol binario: " + arbolBinario.obtenerAltura(raizBinario));
        System.out.print("Imprimir subárbol del nodo 2: ");
        arbolBinario.imprimirSubArbol(buscarNodo(raizBinario, 2));
    }

    public static Nodo convertirABinario(Nodo nodoGeneral) {
        // Implementa la lógica para convertir el árbol general a binario aquí
        // ...

        return nodoGeneral; // Por ahora, devuelve el mismo nodo
    }

    public static Nodo buscarNodo(Nodo nodo, int valor) {
        if (nodo == null) {
            return null;
        }
        if (nodo.valor == valor) {
            return nodo;
        }
        for (Nodo hijo : nodo.hijos) {
            Nodo resultado = buscarNodo(hijo, valor);
            if (resultado != null) {
                return resultado;
            }
        }
        return null;
    }
}
