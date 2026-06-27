package exam.abstractfactory;

public class ProgrammingEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        // Simplified: award points if answer contains basic code structure
        boolean hasCode = answer.contains("{") && answer.contains("}");
        return hasCode ? q.getPoints() : (int)(q.getPoints() * 0.3);
    }
}
