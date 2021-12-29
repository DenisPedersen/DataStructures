package Collection;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetsExamples {
    public static void main(String[] args) {
        Set<Integer> treeSets = new TreeSet<>(); //Ligesom med queue er der på højre side en konkret type af Set.
        treeSets.add(1); //tilføjer element med .add
        treeSets.add(100);
        treeSets.add(1434);
        treeSets.add(123);
        treeSets.add(12);
        System.out.println(treeSets); //sætter automatisk i nummerisk rækkefølge
        treeSets.add(1);
        System.out.println(treeSets); //bemærk, at der kun er et 1-tal. Der kan kun være et element af hver værdi!

        Set<String> wordSet = new TreeSet<>(Comparator.comparing(String :: length)); //laver en treeSet med Strings. Men i stedet for at udskrive alfabetisk ( som er standard i treeset)
                                                                                     //udskrives ud fra ordets længde vha. Comparator.comparing()
        wordSet.add("Tiger");
        wordSet.add("Giraffe");
        wordSet.add("Rabbit");
        wordSet.add("Dog");
        wordSet.add("Duck");
        wordSet.add("Chameleon");
        System.out.println(wordSet);
        wordSet.add("Wolf"); //Wolf vil IKKE blive udskrevet nu, da treeset kigger på længden af ordet, og tænker "Hov! Det er en duplikation af et ord jeg har allerede (Duck), så det skal ikke med"!).
        System.out.println(wordSet);
        wordSet.remove("Giraffe");
        System.out.println(wordSet);
    }
}
