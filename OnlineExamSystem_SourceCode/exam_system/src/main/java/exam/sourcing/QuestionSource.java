package exam.sourcing;

import exam.abstractfactory.Question;

public interface QuestionSource {
    Question getQuestion();
    String getStrategyName();
}
