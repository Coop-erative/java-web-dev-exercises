package excercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        SumEvenNum(list1);
    }
    private static void SumEvenNum(Collection<Integer> collection) {
        //find sum of all even numbers in ArrayList
        Integer sum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        for ( Integer tempInt : collection ) {
            if(tempInt % 2 == 0) {
                numbers.add(tempInt);
            }
        }
        for(int i = 0; i < numbers.size();i++){
            sum += numbers.get(i);
         }
        System.out.println(sum);
    }

}
