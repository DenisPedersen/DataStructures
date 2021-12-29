package Collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(); //bemærk, at der er en konkret version af queue på højre side af lighedstegnet. Her er det ArrayDeque, men kunne også have brugt , priorityQueue (sætter i alfabetisk, nummerisk rækkefølge) etc.
        queue.offer("John"); //på queue bruges .offer til at tilføje elementer til fronten af køen
        queue.offer("Bjarne");
        queue.offer("Brian");
        System.out.println(queue);
        System.out.println(queue.peek()); //viser forreste element i køen
        queue.poll(); //fjerner forreste element i køen
        System.out.println(queue);
    }
}
