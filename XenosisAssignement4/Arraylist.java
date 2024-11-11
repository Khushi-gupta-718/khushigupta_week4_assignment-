import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // Create an ArrayList to store students
        ArrayList<String> students = new ArrayList<>();

        // Add students to the list
        students.add("khushi");
        students.add("rathore");
        students.add("yash");

        // Display all students
        System.out.println("All Students:");
        for (String student : students) {
            System.out.println(student);
        }

        // Remove a student
        students.remove("khushi");

        // Display remaining students
        System.out.println("\nAfter removing khushi:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

