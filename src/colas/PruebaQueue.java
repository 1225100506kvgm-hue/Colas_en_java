package colas;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class PruebaQueue {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("María");
        System.out.println(cola.peek());  
        System.out.println(cola.poll());  
        System.out.println(cola.size());  
        System.out.println(cola);   

        Queue<String> vacia = new LinkedList<>();
        System.out.println("poll():  " + vacia.poll());     
        System.out.println("peek():  " + vacia.peek());     
        try {
            vacia.remove();
        } catch (Exception e) {
            System.out.println("remove(): " + e);          
        }
        try {
            vacia.element();
        } catch (Exception e) {
            System.out.println("element(): " + e);          
        }      

        Queue<Integer> pq = new java.util.PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println(pq.poll()); 
        System.out.println(pq.poll()); 
        System.out.println(pq.poll()); 
    }
}