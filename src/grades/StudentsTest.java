package grades;

public class StudentsTest {

    public static void main (String[] args){
        Student student = new Student("Paul");
        student.setGrades(84.0);
        student.setGrades(73.2);
        student.setGrades(98.3);
        student.setGrades(88.9);

        Student jack = new Student("Jack");

        jack.setGrades(84.3);
        jack.setGrades(76.3);
        jack.setGrades(85.3);
        jack.setGrades(95.6);

        double jackAvg = jack.getGradeAverage();

        double avg = student.getGradeAverage();
        System.out.println("Student " + student.getName() + " has the following grades" + student.grades + " which gives him an average of: " + avg);

        System.out.println("Student " + jack.getName() + " has the following grades " + jack.grades + " which gives him an a average of: " + jackAvg);
    }

}
