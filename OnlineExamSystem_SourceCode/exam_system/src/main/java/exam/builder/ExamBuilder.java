package exam.builder;

public class ExamBuilder {
    private String  title             = "Untitled Exam";
    private int     duration          = 60;
    private int     passingScore      = 50;
    private boolean negativeMarking   = false;
    private boolean questionShuffle   = false;
    private boolean autoSubmit        = false;
    private boolean calculatorAllowed = false;

    public ExamBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ExamBuilder setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public ExamBuilder setPassingScore(int passingScore) {
        this.passingScore = passingScore;
        return this;
    }

    public ExamBuilder enableNegativeMarking() {
        this.negativeMarking = true;
        return this;
    }

    public ExamBuilder enableQuestionShuffle() {
        this.questionShuffle = true;
        return this;
    }

    public ExamBuilder enableAutoSubmit() {
        this.autoSubmit = true;
        return this;
    }

    public ExamBuilder enableCalculator() {
        this.calculatorAllowed = true;
        return this;
    }

    public ExamConfiguration build() {
        return new ExamConfiguration(title, duration, passingScore,
                negativeMarking, questionShuffle, autoSubmit, calculatorAllowed);
    }
}
