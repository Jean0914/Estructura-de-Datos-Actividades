// Clase Nodo que representa un elemento de la pila
class Nodo {
    // Atributos privados
    private int dato; // El valor del nodo
    private Nodo siguiente; // El nodo que está debajo de este

    // Constructor que inicializa los atributos como nulos
    public Nodo() {
        this.dato = 0;
        this.siguiente = null;
    }

    // Setters y getters para los atributos
    public void setDato(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return this.dato;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }
}
