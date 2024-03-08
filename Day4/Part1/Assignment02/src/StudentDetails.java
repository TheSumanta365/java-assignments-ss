public class StudentDetails {
    public static void main(String[] args) {
        Student john = new Student();
        john.setValues("John", 2);

        System.out.println("Details for John:");
        john.printDetails();
        System.out.println();

        Student sam = new Student();
        sam.setValues("Sam", 1);

        System.out.println("Details for Sam:");
        sam.printDetails();
    }
}
