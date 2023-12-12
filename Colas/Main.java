/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author cjean
 */
public class Main {
    public static void main(String[] args) {
System.out.println("Cola simple");
ColaSimple cola = new ColaSimple();
cola.insertar(1);
cola.insertar(2);
cola.insertar(3);
cola.insertar(4);
cola.insertar(5);
System.out.printf("Longitud: %d\n", cola.getLongitud());
System.out.printf("Frente: %d\n", cola.getFrente().getDato());
cola.eliminar();
System.out.printf("Longitud: %d\n", cola.getLongitud());
System.out.printf("Frente: %d\n", cola.getFrente().getDato());
}
}
