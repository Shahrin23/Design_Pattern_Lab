package exam.sourcing;

import exam.abstractfactory.*;
import java.util.Random;

public class QuestionFaker {
    private static final String[] TOPICS   = {"OOP", "Data Structures", "Algorithms", "Design Patterns", "Databases"};
    private static final String[] DIFFS    = {"Easy", "Medium", "Hard"};
    private static final Random   RANDOM   = new Random();

    public static Question generate(String type) {
        String topic = TOPICS[RANDOM.nextInt(TOPICS.length)];
        String diff  = DIFFS [RANDOM.nextInt(DIFFS.length)];

        return switch (type.toLowerCase()) {
            case "mcq"         -> new MCQQuestion(
                    "Auto-generated MCQ on " + topic + "?", 2 + RANDOM.nextInt(3), diff, "A");
            case "true/false"  -> new TrueFalseQuestion(
                    "Auto-generated True/False on " + topic + "?", 1, diff, RANDOM.nextBoolean());
            case "essay"       -> new EssayQuestion(
                    "Discuss the importance of " + topic + " in modern software engineering.", 10, diff);
            case "programming" -> new ProgrammingQuestion(
                    "Write a program demonstrating " + topic + ".", 20, diff, "Java");
            default            -> new MCQQuestion(
                    "Auto-generated question on " + topic + "?", 2, diff, "A");
        };
    }
}
