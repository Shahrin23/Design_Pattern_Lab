package exam.abstractfactory;

import exam.sourcing.QuestionSource;

public class EssayFactory implements QuestionFactory {
    private final QuestionSource source;

    public EssayFactory(QuestionSource source) {
        this.source = source;
    }

    @Override
    public Question createQuestion() {
        return source.getQuestion();
    }

    @Override
    public QuestionRenderer createRenderer() {
        return new EssayRenderer();
    }

    @Override
    public QuestionEvaluator createEvaluator() {
        return new EssayEvaluator();
    }
}
