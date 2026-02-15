package za.ac.cput;

public abstract class Student {
    protected String studentID; //These are the important attributes
    protected String name;//These are the important attributes
    protected String email;
    protected String department;

    public abstract double calculateTuition();
    public abstract String getStudentType();

    public abstract void displayStudentDetails();
}
