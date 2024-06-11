package assignment.directoryPorg;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class DirectoryEntry {
	
	//all var declaration
    String name;
    String address;
    String telephone;
    String mobile;
    String headOfFamily;
    String uniqueID;

    //peramiter con
    public DirectoryEntry(String name, String address, String telephone, String mobile, String headOfFamily, String uniqueID) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.mobile = mobile;
        this.headOfFamily = headOfFamily;
        this.uniqueID = uniqueID;
    }

   
    @Override
    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Telephone: " + telephone + ", Mobile: " + mobile +
                ", Head of Family: " + headOfFamily + ", Unique ID No: " + uniqueID;
    }
}

// main calss
public class DirectoryManager {
    private Map<String, DirectoryEntry> directory;

    public DirectoryManager() {
        directory = new HashMap<>();
    }

    public void createEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Unique ID No: ");
        String uniqueID = scanner.nextLine();

        if (directory.containsKey(uniqueID)) {
            System.out.println("Error: Unique ID No already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Telephone (optional, format: STD code-telephone): ");
        String telephone = scanner.nextLine();
        System.out.print("Enter Mobile Number (optional): ");
        String mobile = scanner.nextLine();
        System.out.print("Enter Head of Family: ");
        String headOfFamily = scanner.nextLine();

        DirectoryEntry entry = new DirectoryEntry(name, address, telephone, mobile, headOfFamily, uniqueID);
        directory.put(uniqueID, entry);
        System.out.println("Entry created successfully!");
    }

    public void editEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter Unique ID No to edit: ");
        String uniqueID = scanner.nextLine();

        if (!directory.containsKey(uniqueID)) {
            System.out.println("Error: Unique ID No not found.");
            return;
        }

        DirectoryEntry entry = directory.get(uniqueID);
        System.out.print("Enter new Name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) entry.name = name;

        System.out.print("Enter new Address (leave blank to keep current): ");
        String address = scanner.nextLine();
        if (!address.isEmpty()) entry.address = address;

        System.out.print("Enter new Telephone (optional, format: STD code-telephone): ");
        String telephone = scanner.nextLine();
        if (!telephone.isEmpty()) entry.telephone = telephone;

        System.out.print("Enter new Mobile Number (optional): ");
        String mobile = scanner.nextLine();
        if (!mobile.isEmpty()) entry.mobile = mobile;

        System.out.print("Enter new Head of Family (leave blank to keep current): ");
        String headOfFamily = scanner.nextLine();
        if (!headOfFamily.isEmpty()) entry.headOfFamily = headOfFamily;

        directory.put(uniqueID, entry);
        System.out.println("Entry updated successfully!");
    }

    public void displayAllEntries() {
        if (directory.isEmpty()) {
            System.out.println("No entries found in the directory.");
            return;
        }

        System.out.println();
        System.out.println("Directory Entries:");
        for (DirectoryEntry entry : directory.values()) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        DirectoryManager manager = new DirectoryManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Display all entries");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    manager.createEntry();
                    break;
                case 2:
                    manager.editEntry();
                    break;
                case 3:
                    manager.displayAllEntries();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
