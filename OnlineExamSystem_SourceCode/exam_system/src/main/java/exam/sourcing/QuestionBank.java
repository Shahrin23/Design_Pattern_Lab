package exam.sourcing;

import exam.abstractfactory.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class QuestionBank {
    private static final List<Question> BANK = Arrays.asList(
        new MCQQuestion("Which keyword is used to inherit a class in Java?", 2, "Easy", "B"),
        new MCQQuestion("What is the time complexity of binary search?", 2, "Medium", "C"),
        new MCQQuestion("Which of the following is NOT a creational design pattern?", 2, "Medium", "D"),
        new TrueFalseQuestion("The Abstract Factory pattern creates families of related objects.", 1, "Easy", true),
        new TrueFalseQuestion("Java supports multiple inheritance through classes.", 1, "Easy", false),
        new EssayQuestion("Explain the SOLID principles with examples.", 10, "Hard"),
        new EssayQuestion("Describe the difference between composition and inheritance.", 10, "Hard"),
        new ProgrammingQuestion("Implement a generic Stack using Java Generics.", 20, "Hard", "Java"),
        new ProgrammingQuestion("Write a recursive function to compute Fibonacci numbers.", 15, "Medium", "Java")
    );

    private static final Random RANDOM = new Random();

    public static Question getRandom() {
        return BANK.get(RANDOM.nextInt(BANK.size()));
    }

    public static Question getByType(String type) {
        List<Question> filtered = BANK.stream()
                .filter(q -> q.getType().equalsIgnoreCase(type))
                .collect(java.util.stream.Collectors.toList());
        if (filtered.isEmpty()) return BANK.get(0);
        return filtered.get(RANDOM.nextInt(filtered.size()));
    }
}
