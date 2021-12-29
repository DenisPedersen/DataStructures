package Collection;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class CollectionExerciseTest {
    CollectionExercise collectionExercise = new CollectionExercise();

    @Test
    public void testAddSixToEndOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        collectionExercise.addToEndOfLinkedList(numbers, 6);
        assertEquals(Integer.valueOf(6), numbers.getLast()); //tjekker om det er det forventede
    }
    @Test
    public void testAddZeroToStartOfLinkedList() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
        collectionExercise.addToStartOfLinkedList(numbers, 0);
        assertEquals(Integer.valueOf(0), numbers.getFirst()); //tjekker om det er det forventede
    }

    @Test
    public void testRemoveItemFromTopOfStack() {
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        collectionExercise.removeItemFromTopOfStack(stack);
        assertEquals(Integer.valueOf(4), stack.peek()); //tjekker om det er det forventede
    }

    @Test
    public void testRemoveItemFromFrontOfQueue() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        collectionExercise.removeItemFromFrontOfQueue(queue);
        assertEquals(Integer.valueOf(2), queue.peek());
    }

    @Test
    public void testAddItemToTreeSet() {
        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("orange");
        set.add("yellow");
        collectionExercise.addItemToTreeSet(set);
    }
}
