import java.util.Arrays;

public class Student {
    private int rollNumber;
    private double[] marks;

    public Student(int rollNumber, double[] marks) {
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = Arrays.stream(marks).sum();
        return sum / marks.length;
    }

    public void printDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println();
    }
}
