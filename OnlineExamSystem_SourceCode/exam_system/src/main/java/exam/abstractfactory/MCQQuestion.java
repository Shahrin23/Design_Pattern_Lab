package exam.abstractfactory;

public class MCQQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;
    private final String correctOption;

    public MCQQuestion(String text, int points, String difficulty, String correctOption) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
        this.correctOption = correctOption;
    }

    @Override public String getType()       { return "MCQ"; }
    @Override public int    getPoints()     { return points; }
    @Override public String getDifficulty() { return difficulty; }
    @Override public String getText()       { return text; }
    public    String getCorrectOption()     { return correctOption; }
}
