public class Record {

    // Instance variables
    private String name;
    private int idNumber;
    private int contactNumber;

    // Default Constructor
    public Record() {
    }

    // Parameterized Constructor
    public Record(String name, int idNumber, int contactNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    // Display student information
    @Override
    public String toString() {
        return "\n-----------------------------"
                + "\nStudent Name      : " + name
                + "\nStudent ID        : " + idNumber
                + "\nContact Number    : " + contactNumber
                + "\n-----------------------------";
    }
}