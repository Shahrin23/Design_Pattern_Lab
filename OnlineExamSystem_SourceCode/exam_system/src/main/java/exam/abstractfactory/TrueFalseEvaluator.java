package exam.abstractfactory;

public class TrueFalseEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        TrueFalseQuestion tfq = (TrueFalseQuestion) q;
        boolean studentAns = answer.trim().equalsIgnoreCase("true") || answer.trim().equalsIgnoreCase("T");
        return (studentAns == tfq.getAnswer()) ? tfq.getPoints() : 0;
    }
}
