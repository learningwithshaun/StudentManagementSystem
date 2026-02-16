package za.ac.cput;

import javax.swing.*;
import java.util.StringJoiner;

public class UndergraduateStudent extends Student {
    private final int creditHours;
    private final double scholarshipAmount;

    public UndergraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return 0;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {

        StringJoiner joiner = new StringJoiner("\n", "Student ", ".");

        joiner.add("ID:" + studentId);
        joiner.add("Name: " + name);

        if (email != null) {
            joiner.add("Email: " + email);
        }
        if (department != null) {
            joiner.add("Department: " + department);
        }
        if (creditHours > 0) {
            joiner.add("Credit Hours: " + creditHours);
        }
        if (scholarshipAmount > 0) {
            joiner.add("Scholarship Amount: " + scholarshipAmount);
        }
        System.out.println(joiner.toString());
    }

    public static class Builder {
        private final String studentId;
        private final String name;

        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder(String studentId, String name) {
            this.studentId = studentId;
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}

