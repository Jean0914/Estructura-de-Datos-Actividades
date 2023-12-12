// Clase Pila que implementa las operaciones de una pila
class Pila {
    // Atributo privado que representa la cima de la pila
    private Nodo cima;

    // Constructor que inicializa la cima como nula
    public Pila() {
        this.cima = null;
    }

    // Método para insertar un elemento en la cima de la pila
    public void push(int dato) {
        // Crear un nuevo nodo con el dato
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        // Si la pila está vacía, el nuevo nodo es la cima
        if (this.cima == null) {
            this.cima = nuevo;
        } else {
            // Si no, el nuevo nodo apunta al nodo que estaba en la cima
            nuevo.setSiguiente(this.cima);
            // Y el nuevo nodo se convierte en la cima
            this.cima = nuevo;
        }
    }

    // Método para quitar el elemento de la cima de la pila
    public int pop() {
        // Si la pila está vacía, se devuelve -1 como indicador de error
        if (this.cima == null) {
            return -1;
        } else {
            // Si no, se guarda el dato del nodo que está en la cima
            int dato = this.cima.getDato();
            // Se hace que la cima sea el nodo que está debajo del que se va a quitar
            this.cima = this.cima.getSiguiente();
            // Se devuelve el dato del nodo que se quitó
            return dato;
        }
    }

    // Método para comprobar si una pila está vacía
    public boolean isEmpty() {
        // Si la cima es nula, la pila está vacía
        return this.cima == null;
    }

    // Método para vaciar la pila
    public void clear() {
        // Mientras la pila no esté vacía, se quita el elemento de la cima
        while (!this.isEmpty()) {
            this.pop();
        }
    }

    // Método para obtener el elemento que está en la cima de la pila
    public int peek() {
        // Si la pila está vacía, se devuelve -1 como indicador de error
        if (this.cima == null) {
            return -1;
        } else {
            // Si no, se devuelve el dato del nodo que está en la cima
            return this.cima.getDato();
        }
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        // Se inicializa un contador en cero
        int contador = 0;
        // Se crea un nodo auxiliar que apunta a la cima
        Nodo aux = this.cima;
        // Mientras el nodo auxiliar no sea nulo, se incrementa el contador y se avanza al siguiente nodo
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        // Se devuelve el valor del contador
        return contador;
    }
}
