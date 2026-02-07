import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    static class Student {
        String name;
        int marks;

        Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // clear buffer

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            studentList.add(new Student(name, marks));
        }

        int total = 0;
        int highest = studentList.get(0).marks;
        int lowest = studentList.get(0).marks;

        for (Student s : studentList) {
            total += s.marks;

            if (s.marks > highest)
                highest = s.marks;

            if (s.marks < lowest)
                lowest = s.marks;
        }

        double average = (double) total / n;

        System.out.println("\n----- STUDENT SUMMARY REPORT -----");
        System.out.println("Name\tMarks");

        for (Student s : studentList) {
            System.out.println(s.name + "\t" + s.marks);
        }

        System.out.println("---------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}
