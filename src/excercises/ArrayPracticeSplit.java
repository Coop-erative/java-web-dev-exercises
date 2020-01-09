package excercises;

import java.util.Arrays;

public class ArrayPracticeSplit {
    public static void main(String[] args) {
       //Create string and empty Array.
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        //use split method to separate by spaces
        String[] spaced = str.split(" ");

        //below option to split into sentences.
        //String[] spaced = str.split("//.");

        System.out.println(Arrays.toString(spaced));
    }
}
