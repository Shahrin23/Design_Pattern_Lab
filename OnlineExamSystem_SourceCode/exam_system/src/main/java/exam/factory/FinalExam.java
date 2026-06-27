package exam.factory;

public class FinalExam implements Exam {
    @Override
    public String getType() {
        return "Final Exam";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam Type : Final Exam");
        System.out.println("Rules     : Maximum security, high-stakes, definitive weight.");
    }
}
