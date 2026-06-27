package exam.abstractfactory;

public class MCQEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        MCQQuestion mcq = (MCQQuestion) q;
        return mcq.getCorrectOption().equalsIgnoreCase(answer.trim()) ? mcq.getPoints() : 0;
    }
}
