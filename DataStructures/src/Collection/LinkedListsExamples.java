package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsExamples {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("Tomatoes");
        shoppingList.add("Banana");
        shoppingList.add("Bread");
        System.out.println(shoppingList);
        //hvis jeg nu vil tilføje et element på en bestemt plads kan det gøres ud fra indekset således:
        shoppingList.add(2, "Milk");
        System.out.println(shoppingList);

        //Linkedlister er hurtigere end ArrayLister til at tilføje og fjerne elementer.
        //ArrayLister er lister som bliver ændret i størrelsen, hvor en LinkedList
        //er en liste af elementer som er "linked" til hinanden (både hvad der kommer før og efter).
        //Derfor er LinkedLister også langsommere til at hente tilfældige elementer, da listen først skal se hvad der kommer før og efter
        //det valgte element.
        //Kort sagt: ArrayLister er hurtigere til at hente tilfældige elementer.
        //           LinkedLists er hurtigere til at tilføje og fjerne elementer.

        shoppingList.removeFirst(); //metode der fjerner forreste element
        shoppingList.removeLast();
        System.out.println(shoppingList);

        List<String> synchronizedShoppingList = Collections.synchronizedList(shoppingList); //laver en kopi, så man ikke ændrer i forskellige lister
        System.out.println(synchronizedShoppingList);

        ArrayList<String> books = new ArrayList<>();
        books.add(0,"Bibelen");
        books.add("Arnes Bog");
        books.add("Børnebog");
        books.add("Pippi Langstrømpe");
        for (int i =0; i<books.size(); i++) {
            System.out.println(books.get(i));
            if (books.get(i).equals("Børnebog")) {
                System.out.println("Her er bogen: " + books.get(i));
                break;
            }
        }
    }
}
