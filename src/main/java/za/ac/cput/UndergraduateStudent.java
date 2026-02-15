package za.ac.cput;

import javax.swing.*;

public class UndergraduateStudent extends Student {
    private final int creditHours;
    private final double scholarshipAmount;

    public UndergraduateStudent(Builder builder) {
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        return 0;
    }

    @Override
    public String getStudentType() {
        return "";
    }

    @Override
    public void displayStudentDetails() {

    }

    public static class Builder {
        private final int studentID;
        private final String name;

        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder(int studentID, String name) {
            this.studentID = studentID;
            this.name = name;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Builder department(String department){
            this.department = department;
            return this;
        }

        public Builder creditHours(int creditHours){
            this.creditHours = creditHours;
            return this;
        }

        public Builder scholarshipAmount(double scholarshipAmount){
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build(){
            return new UndergraduateStudent(this);
        }
    }
}
