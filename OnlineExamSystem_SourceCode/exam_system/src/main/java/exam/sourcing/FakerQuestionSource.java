package exam.sourcing;

import exam.abstractfactory.Question;

public class FakerQuestionSource implements QuestionSource {
    private final String questionType;

    public FakerQuestionSource(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public Question getQuestion() {
        return QuestionFaker.generate(questionType);
    }

    @Override
    public String getStrategyName() {
        return "Auto/Faker Mode";
    }
}
