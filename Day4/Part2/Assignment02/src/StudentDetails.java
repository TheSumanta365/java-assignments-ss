   import java.util.Scanner;

    public class StudentDetails{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Student[] students = new Student[8];

            // Input marks for each
            for (int i = 0; i < students.length; i++) {
                System.out.println("Enter marks for Student " + (i + 1) + ":");
                double[] marks = new double[3];

                for (int j = 0; j < marks.length; j++) {
                    System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                    marks[j] = scanner.nextDouble();
                }

                students[i] = new Student(i + 1, marks);
            }

            System.out.println("\nStudent Details:");
            for (Student student : students) {
                student.printDetails();
            }
        }
    }

