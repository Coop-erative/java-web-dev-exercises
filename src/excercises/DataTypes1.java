package excercises;

import java.util.Scanner;

public class DataTypes1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("hello, what is your name:");

        String name = input.nextLine();
        System.out.println("Hello " + name);
    }
}
