package exam.factory;

public class MidtermExam implements Exam {
    @Override
    public String getType() {
        return "Midterm Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam Type : Midterm Exam");
        System.out.println("Rules     : Single attempt, strict time limits, comprehensive configurations.");
    }
}
