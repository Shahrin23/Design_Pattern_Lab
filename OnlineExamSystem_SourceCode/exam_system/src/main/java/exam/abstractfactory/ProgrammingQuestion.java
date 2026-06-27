package exam.abstractfactory;

public class ProgrammingQuestion implements Question {
    private final String text;
    private final int points;
    private final String difficulty;
    private final String language;

    public ProgrammingQuestion(String text, int points, String difficulty, String language) {
        this.text = text;
        this.points = points;
        this.difficulty = difficulty;
        this.language = language;
    }

    @Override public String getType()       { return "Programming"; }
    @Override public int    getPoints()     { return points; }
    @Override public String getDifficulty() { return difficulty; }
    @Override public String getText()       { return text; }
    public    String        getLanguage()   { return language; }
}
