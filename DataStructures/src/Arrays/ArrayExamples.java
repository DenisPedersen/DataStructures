package Arrays;

import java.util.Arrays;
import java.util.Locale;

public class ArrayExamples {
    //Arrays kan indeholde både primitive datatyper og objekter, men alle elementer skal være samme datatype (ikke blande String med ints, etc.).
    String  [] words = new String[3]; //nu er længden på arrayet fast (3) og kan ikke ændres.

    public static void main(String[] args) {
        String [] weekdays = new String [7];
        System.out.println(Arrays.toString(weekdays));  //for at printe som en String benyttes Arrays.toString-metoden.
        weekdays[0] = "Monday"; //sådan tilføjes et element på den 0'te plads i arrayet.
        System.out.println(Arrays.toString(weekdays));  //for at printe som en String benyttes Arrays.toString-metoden.
        weekdays = new String[] {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}; //sådan kan man lave et array og tilføje elementer hertil samtidig.
        System.out.println(Arrays.toString(weekdays));  //Nu printes det nyeste array.

        for (String day : weekdays) {   //sådan kan man også udskrive elementerne i et for each loop
            System.out.println("Today it is " + day);
        }

        for (int i = 0; i <weekdays.length ; i++) {
            weekdays[i] = weekdays[i].toUpperCase(); //sætter alle dagene på i's plads til at være med store bogstaver

        }
        System.out.println(Arrays.toString(weekdays)); //husk at sætte udenfor for-loopet, så det ikke udskrives 7 gange.
    }

}
