package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StacksExamples {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Anna");
        stack.push("Brian");
        stack.push("Bjarne");
        System.out.println(stack);
        System.out.println(stack.peek()); //viser første elementer på stacken
        stack.pop(); //fjerner øverste element på stacken
        System.out.println(stack);

    }
}
