// Clase Main que prueba la clase Pila
class Main {
    public static void main(String[] args) {
        // Se instancia una pila vacía
        Pila pila = new Pila();
        // Se insertan los números 14, 27, 1, 15, 10, 90, 71, 37, 2, 48
        pila.push(14);
        pila.push(27);
        pila.push(1);
        pila.push(15);
        pila.push(10);
        pila.push(90);
        pila.push(71);
        pila.push(37);
        pila.push(2);
        pila.push(48);
        // Se imprime el tamaño de la pila
        System.out.println("El tamaño de la pila es: " + pila.size());
        // Se quitan 4 elementos
        pila.pop();
        pila.pop();
        pila.pop();
        pila.pop();
        // Se imprime el elemento de la cima de la pila
        System.out.println("El elemento de la cima de la pila es: " + pila.peek());
        // Se vacía la pila
        pila.clear();
        // Se imprime si la pila está vacía
        System.out.println("La pila está vacía: " + pila.isEmpty());
    }
}
