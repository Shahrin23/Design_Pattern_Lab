package exam.abstractfactory;

public class TrueFalseQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;
    private final boolean answer;

    public TrueFalseQuestion(String text, int points, String difficulty, boolean answer) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
        this.answer = answer;
    }

    @Override public String getType()       { return "True/False"; }
    @Override public int    getPoints()     { return points; }
    @Override public String getDifficulty() { return difficulty; }
    @Override public String getText()       { return text; }
    public    boolean       getAnswer()     { return answer; }
}
