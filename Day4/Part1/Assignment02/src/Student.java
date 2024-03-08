public class Student {
    private String name;
    private int roll_no;

    public void setValues(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll_no);
    }
}

