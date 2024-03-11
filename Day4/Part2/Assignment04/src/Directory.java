import java.util.ArrayList;

public class Directory {
    private ArrayList<DirectoryEntry> entries;

    // Constructor
    public Directory() {
        entries = new ArrayList<>();
    }

    // Add entry
    public void addEntry(DirectoryEntry entry) {
        entries.add(entry);
    }

    // Edit entry
    public void editEntry(String uniqueID, String newAddress, String newTelephoneNumber, String newMobileNumber) {
        for (DirectoryEntry entry : entries) {
            if (entry.getUniqueID().equals(uniqueID)) {
                entry.setAddress(newAddress);
                entry.setTelephoneNumber(newTelephoneNumber);
                entry.setMobileNumber(newMobileNumber);
                System.out.println("Entry edited successfully.");
                return;
            }
        }
        System.out.println("Entry not found.");
    }

    // Search by keyword
    public void searchByKeyword(String keyword) {
        for (DirectoryEntry entry : entries) {
            if (entry.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getAddress().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getTelephoneNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getMobileNumber().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getHeadOfFamily().toLowerCase().contains(keyword.toLowerCase()) ||
                    entry.getUniqueID().toLowerCase().contains(keyword.toLowerCase())) {
                entry.display();
            }
        }
    }

    // Display all entries
    public void displayAllEntries() {
        for (DirectoryEntry entry : entries) {
            entry.display();
        }
    }
}
