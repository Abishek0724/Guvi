import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    static HashMap<String, Integer> students = new HashMap<>();

    public static void addStudent(String name, int grade) {
        students.put(name, grade);
        System.out.println("Student added successfully!");
    }

    
    public static void removeStudent(String name) {
        if (students.containsKey(name)) {
            students.remove(name);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    
    public static void displayGrade(String name) {
        if (students.containsKey(name)) {
            System.out.println(name + "'s Grade: " + students.get(name));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addStudent("John", 85);
        addStudent("Alice", 90);

        System.out.println("Enter student name to see grade:");
        String name = sc.nextLine();
        displayGrade(name);

        System.out.println("Enter student name to remove:");
        String nameToRemove = sc.nextLine();
        removeStudent(nameToRemove);

        System.out.println("Updated Students List: " + students);
        sc.close();
    }
}
