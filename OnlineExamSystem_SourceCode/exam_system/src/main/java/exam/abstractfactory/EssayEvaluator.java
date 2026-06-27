package exam.abstractfactory;

public class EssayEvaluator implements QuestionEvaluator {
    @Override
    public int evaluate(Question q, String answer) {
        // Simplified: award full marks if answer length is reasonable
        int wordCount = answer.trim().split("\\s+").length;
        return (wordCount >= 50) ? q.getPoints() : (int)(q.getPoints() * 0.5);
    }
}
