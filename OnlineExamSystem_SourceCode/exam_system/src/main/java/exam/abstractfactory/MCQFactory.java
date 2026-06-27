package exam.abstractfactory;

import exam.sourcing.QuestionSource;

public class MCQFactory implements QuestionFactory {
    private final QuestionSource source;

    public MCQFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new MCQRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new MCQEvaluator();
    }
}
