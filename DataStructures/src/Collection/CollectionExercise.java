package Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class CollectionExercise {
    public void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    public void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(0, i);
    }

    public void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    public void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    public void addItemToTreeSet(Set<String> set) {
        set.add("green");

    }
}

