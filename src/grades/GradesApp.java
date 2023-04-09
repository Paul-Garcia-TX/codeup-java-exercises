package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApp extends Student {

    public GradesApp(String name) {
        super(name);
    }

    public static void main (String[] args){
        HashMap<String, Object> student1 = new HashMap<>();

        student1.put("Name", "John");
        student1.put("GitHub Username", "Excellsior");
        student1.put("grade", 93);
        student1.put("Pizza", "pepperoni");



        HashMap<String, Object> student2 = new HashMap<>();

        student2.put("Name", "Paul");
        student2.put("GitHub Username", "Bazinga");
        student2.put("grade", 95);
        student2.put("Pizza", "hawaiian");

        HashMap<String, Object> student3 = new HashMap<>();


        student3.put("Name", "George");
        student3.put("GitHub Username", "OfTheJungle");
        student3.put("grade", 90);
        student3.put("Pizza", "meat lovers");

        HashMap<String, Object> student4 = new HashMap<>();


        student4.put("Name", "Ringo");
        student4.put("GitHub Username", "DrummerBoy");
        student4.put("grade", 80);
        student4.put("Pizza", "supreme");

        HashMap<String, Object> students = new HashMap<>();
        students.put("John", student1);
        students.put("Paul",student2);
        students.put("George", student3);
        students.put("Ringo", student4);

        System.out.println("Welcome");
        System.out.println("Here are the Github usernames of my students: ");
        for (String name : students.keySet()){
            HashMap<String, Object> student = (HashMap<String, Object>) students.get(name);
            String ghUsername = (String) student.get("GitHub Username");
            System.out.println(name + " : " + ghUsername);

        }
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Terminal");
            System.out.print("Type something> ");
            String input = scanner.nextLine();

            switch (input) {
                case "quit":
                    System.out.println("Goodbye!");
                    return;
                case "list":
                    System.out.println("Here are the students:");
                    for (String name : students.keySet()) {
                        System.out.println("- " + name);
                    }
                    break;
                case "info":
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    if (!students.containsKey(name)) {
                        System.out.println("Sorry, no student found with that name.");
                    } else {
                        HashMap<String, Object> student = (HashMap<String, Object>) students.get(name);
                        System.out.println("Name: " + student.get("Name"));
                        System.out.println("GitHub Username: " + student.get("GitHub Username"));
                        System.out.println("Grade: " + student.get("grade"));
                        System.out.println("Favorite Pizza: " + student.get("Pizza"));
                    }
                    break;
                default:
                    System.out.println("Sorry, command not recognized.");
            }
        }

    }
}
