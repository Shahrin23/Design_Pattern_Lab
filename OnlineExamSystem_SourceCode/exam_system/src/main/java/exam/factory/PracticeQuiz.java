package exam.factory;

public class PracticeQuiz implements Exam {
    @Override
    public String getType() {
        return "Practice Quiz";
    }

    @Override
    public void displayInfo() {
        System.out.println("Exam Type : Practice Quiz");
        System.out.println("Rules     : Unlimited attempts, low stakes, short duration.");
    }
}
