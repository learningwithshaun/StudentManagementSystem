package za.ac.cput;

import java.util.StringJoiner;

public class GraduateStudent extends Student {
    private final boolean researchAssistant;
    private final double stipend;

    public GraduateStudent(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        return 0;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        StringJoiner joiner = new StringJoiner("\n", "Student ", ".");

        joiner.add("Type: " + getStudentType());
        joiner.add("ID:" + studentId);
        joiner.add("Name: " + name);

        if (email != null) {
            joiner.add("Email: " + email);
        }
        if (department != null) {
            joiner.add("Department: " + department);
        }
        if (researchAssistant != false) {
            joiner.add("Research Assistant: " + researchAssistant);
        }
        if (stipend > 0) {
            joiner.add("Stipend: " + stipend);
        }
        System.out.println(joiner.toString());
    }

    public static class Builder {
        private final String studentId;
        private final String name;

        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

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

        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }
        public Builder stipend(double stipend){
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(this);
        }
    }
}
