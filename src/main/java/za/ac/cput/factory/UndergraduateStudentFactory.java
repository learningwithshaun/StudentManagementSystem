package za.ac.cput.factory;

import za.ac.cput.Student;
import za.ac.cput.UndergraduateStudent;

public class UndergraduateStudentFactory {
    public static Student createStudent(String studentId, String name){

        return new UndergraduateStudent.Builder().build();
    }
}
