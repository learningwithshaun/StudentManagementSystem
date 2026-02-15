package za.ac.cput;

public class GraduateStudent extends Student{
    private final boolean researchAssistant;
    private final double stipend;

    public GraduateStudent(Builder builder){
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
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

    public static class Builder{
        private final int studentId;
        private final String name;

        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder(int studentId, String name) {
            this.studentId = studentId;
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

        public Builder researchAssistant(boolean researchAssistant){
            this.researchAssistant = researchAssistant;
            return this;
        }

        public GraduateStudent build(){
            return new GraduateStudent(this);
        }
    }
}
