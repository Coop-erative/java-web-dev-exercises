package excercises;

import java.util.Scanner;

public class DataTypes2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle's Width: ");
        int width = input.nextInt();

        System.out.println("Rectangle's Height: ");
        int height = input.nextInt();

        int area = (height * width);
        System.out.println("Rectangles Area =  " + area);
    }
}
