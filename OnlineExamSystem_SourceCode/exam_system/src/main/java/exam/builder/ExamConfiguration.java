package exam.builder;

public class ExamConfiguration {
    private final String  title;
    private final int     duration;
    private final int     passingScore;
    private final boolean negativeMarking;
    private final boolean questionShuffle;
    private final boolean autoSubmit;
    private final boolean calculatorAllowed;

    // Package-private constructor: only ExamBuilder can instantiate
    ExamConfiguration(String title, int duration, int passingScore,
                      boolean negativeMarking, boolean questionShuffle,
                      boolean autoSubmit, boolean calculatorAllowed) {
        this.title             = title;
        this.duration          = duration;
        this.passingScore      = passingScore;
        this.negativeMarking   = negativeMarking;
        this.questionShuffle   = questionShuffle;
        this.autoSubmit        = autoSubmit;
        this.calculatorAllowed = calculatorAllowed;
    }

    public String  getTitle()             { return title; }
    public int     getDuration()          { return duration; }
    public int     getPassingScore()      { return passingScore; }
    public boolean isNegativeMarking()    { return negativeMarking; }
    public boolean isQuestionShuffle()    { return questionShuffle; }
    public boolean isAutoSubmit()         { return autoSubmit; }
    public boolean isCalculatorAllowed()  { return calculatorAllowed; }
}
