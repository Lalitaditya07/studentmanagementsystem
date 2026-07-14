import java.util.Scanner;

public class StudentRecordLinkedList {

    public static void main(String[] args) {

        // Create Student Record Management object
        StudentRecordManagement studentManager = new StudentRecordManagement();

        // Create first student record
        Record record = new Record();
        record.setIdNumber(500123862);
        record.setContactNumber(911);
        record.setName("Ankit");

        // Add initial student record
        studentManager.add(record);

        Scanner input = new Scanner(System.in);
        int option;

        do {

            menu();
            option = input.nextInt();

            switch (option) {

                // Add Student
                case 1:

                    System.out.print("Enter Student ID: ");
                    int idNumber = input.nextInt();

                    System.out.print("Enter Contact Number: ");
                    int contactNumber = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = input.nextLine();

                    record = new Record(name, idNumber, contactNumber);

                    studentManager.add(record);

                    System.out.println("\nStudent Added Successfully!");
                    System.out.println(record);

                    break;

                // Delete Student
                case 2:

                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = input.nextInt();

                    studentManager.delete(deleteId);

                    break;

                // Update Student
                case 3:

                    System.out.print("Enter Student ID to update: ");
                    int updateId = input.nextInt();

                    studentManager.update(updateId, input);

                    break;

                // Search Student
                case 4:

                    System.out.print("Enter Student ID to search: ");
                    int searchId = input.nextInt();

                    if (!studentManager.find(searchId)) {
                        System.out.println("Student not found.");
                    }

                    break;

                // Display Students
                case 5:

                    studentManager.display();

                    break;

                // Exit
                case 9:

                    System.out.println("\nThank you for using the Student Management System.");
                    input.close();
                    System.exit(0);
                    break;

                default:

                    System.out.println("\nInvalid choice! Please try again.\n");
            }

        } while (option != 9);
    }

    // Display Menu
    public static void menu() {

        System.out.println("\n===================================");
        System.out.println(" UNIVERSITY STUDENT MANAGEMENT");
        System.out.println("===================================");
        System.out.println("1. Add Student");
        System.out.println("2. Delete Student");
        System.out.println("3. Update Student");
        System.out.println("4. Search Student");
        System.out.println("5. Display All Students");
        System.out.println("9. Exit");
        System.out.print("Enter your choice: ");
    }
}