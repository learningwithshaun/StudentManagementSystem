package za.ac.cput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s = new UndergraduateStudent.Builder("222428600", "Amanda Msutu")
                .email("222428600@mycput.ac.za")
                .department("Engineering")
                .creditHours(250)
                .scholarshipAmount(2000000)
                .build();

        Student g = new GraduateStudent.Builder("230070728", "Isaac Ntuli")
                .email("230070728@mycput.ac.za")
                .department("Engineering")
                .researchAssistant(true)
                .stipend(100000.00)
                .build();

        s.displayStudentDetails();
        System.out.println();
        g.displayStudentDetails();
    }
}