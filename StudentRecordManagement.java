import java.util.LinkedList;
import java.util.Scanner;

public class StudentRecordManagement {

    // Linked List to store student records
    private LinkedList<Record> list;

    // Constructor
    public StudentRecordManagement() {
        list = new LinkedList<>();
    }

    // Add a student record
    public void add(Record record) {

        if (!find(record.getIdNumber())) {
            list.add(record);
            
        } else {
            System.out.println("Student ID already exists.");
        }
    }

    // Search student by ID
    public boolean find(int idNumber) {

        for (Record record : list) {

            if (record.getIdNumber() == idNumber) {
                System.out.println(record);
                return true;
            }
        }

        return false;
    }

    // Delete student
    public void delete(int idNumber) {

        Record student = findRecord(idNumber);

        if (student == null) {

            System.out.println("Student not found.");

        } else {

            list.remove(student);
            System.out.println("Student deleted successfully.");
        }
    }

    // Return Record object
    public Record findRecord(int idNumber) {

        for (Record record : list) {

            if (record.getIdNumber() == idNumber) {
                return record;
            }
        }

        return null;
    }

    // Update student details
    public void update(int idNumber, Scanner input) {

        Record student = findRecord(idNumber);

        if (student == null) {

            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new Student ID: ");
        int newId = input.nextInt();

        System.out.print("Enter new Contact Number: ");
        int newContact = input.nextInt();
        input.nextLine();

        System.out.print("Enter new Student Name: ");
        String newName = input.nextLine();

        student.setIdNumber(newId);
        student.setContactNumber(newContact);
        student.setName(newName);

        System.out.println("Student updated successfully.");
    }

    // Display all students
    public void display() {

        if (list.isEmpty()) {

            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n========== STUDENT RECORDS ==========\n");

        for (Record record : list) {
            System.out.println(record);
        }
    }
}