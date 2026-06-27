package exam.sourcing;

import exam.abstractfactory.Question;

public class BankQuestionSource implements QuestionSource {
    private final String questionType;

    public BankQuestionSource(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public Question getQuestion() {
        return QuestionBank.getByType(questionType);
    }

    @Override
    public String getStrategyName() {
        return "Question Bank Mode";
    }
}
