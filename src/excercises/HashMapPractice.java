package excercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMapID();
    }
    private static void HashMapID() {
        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");
        //Get students names and grades
        do {
            System.out.println("student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);
                // Read in the newLine before Looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));

        //Print class roster
        System.out.println("/nClass roster:");
        double sum = 0;

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }
        input.close();
    }
}
