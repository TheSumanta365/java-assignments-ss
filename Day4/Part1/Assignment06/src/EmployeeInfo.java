public class EmployeeInfo {
        private String name;
        private int yearOfJoining;
        private String address;

        // Constructor
        public EmployeeInfo(String name, int yearOfJoining, String address) {
            this.name = name;
            this.yearOfJoining = yearOfJoining;
            this.address = address;
        }

        // Method to print employee information
        public void printEmployeeInfo() {
            System.out.printf("%-20s %-20s %-20s%n", name, yearOfJoining, address);
        }

        public static void main(String[] args) {
            // Create instances of the 'Employee' class for three employees
            EmployeeInfo employee1 = new EmployeeInfo("Robert", 1994, "64C- WallsStreet");
            EmployeeInfo employee2 = new EmployeeInfo("Sam", 2000, "68D- WallsStreet");
            EmployeeInfo employee3 = new EmployeeInfo("John", 1999, "26B- WallsStreet");

            // Print header
            System.out.printf( "%-20s %-20s %-20s%n","Name", "Year of Joining", "Address");

            // Print information of three employees
            employee1.printEmployeeInfo();
            employee2.printEmployeeInfo();
            employee3.printEmployeeInfo();
        }
    }

