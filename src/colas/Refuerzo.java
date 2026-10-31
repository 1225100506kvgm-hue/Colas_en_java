package colas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Refuerzo {
    public static <T> void invertir(Queue<T> cola) {
        Deque<T> pila = new ArrayDeque<>();
        while (!cola.isEmpty()) {
            pila.push(cola.poll());  
        }
        while (!pila.isEmpty()) {
            cola.offer(pila.pop()); 
        }
    }

    public static void main(String[] args) {
        ColaEnlazada<String> c = new ColaEnlazada<>();
        c.encolar("A");
        c.encolar("B");
        c.encolar("C");
        c.imprimirCola();                    
        c.vaciar();
        System.out.println(c.estaVacia());  

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        invertir(q);
        System.out.println(q);            
    }
}