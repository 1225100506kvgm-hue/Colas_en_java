package colas;

public class Nodo<T> {

    T dato;
    Nodo<T> siguiente;
    Nodo(T dato) {
        this.dato = dato;
    }
}