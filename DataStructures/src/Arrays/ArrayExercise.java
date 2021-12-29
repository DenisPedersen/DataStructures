package Arrays;

import java.util.Arrays;

public class ArrayExercise {

    public void arrayToUpperCase(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i].toUpperCase();
        }
    }

    public void incrementArray(int[] input) {
        //add code her to increment each element in the array by 1.
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        for (int i = 0; i < input.length; i++) {
            System.out.println(input);
            numbers[i]++;
            System.out.println(input);
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 3, 5, 7, 9};
        ArrayExercise a = new ArrayExercise();
        a.incrementArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers));
            numbers[i]++;
            System.out.println(Arrays.toString(numbers));

        }
    }
}
