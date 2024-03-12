import java.util.Scanner;

public class DirectoryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Display all entries");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();

                    System.out.print("Enter Telephone Number: ");
                    String telephoneNumber = scanner.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber = scanner.nextLine();

                    System.out.print("Enter Head of Family: ");
                    String headOfFamily = scanner.nextLine();

                    System.out.print("Enter Unique ID: ");
                    String uniqueID = scanner.nextLine();

                    DirectoryEntry newEntry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueID);
                    directory.addEntry(newEntry);
                    System.out.println("Entry added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Address: ");
                    String address1 = scanner.nextLine();

                    System.out.print("Enter Telephone Number: ");
                    String telephoneNumber1 = scanner.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    String mobileNumber1 = scanner.nextLine();

                    System.out.print("Enter Unique ID: ");
                    String uniqueID1 = scanner.nextLine();


            }
        }
    }
}