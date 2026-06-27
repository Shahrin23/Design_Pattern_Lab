package exam.main;

import exam.abstractfactory.*;
import exam.builder.*;
import exam.factory.*;
import exam.sourcing.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // ─────────────────────────────────────────────────────────────────
        // STEP 1: Factory Method — choose exam format
        // ─────────────────────────────────────────────────────────────────
        ExamFactory examFactory = new MidtermExamFactory();
        Exam exam = examFactory.createExam();

        // ─────────────────────────────────────────────────────────────────
        // STEP 2: Choose Question Sourcing Strategy (Bank Mode)
        // ─────────────────────────────────────────────────────────────────
        QuestionSource mcqSource  = new BankQuestionSource("MCQ");
        QuestionSource tfSource   = new BankQuestionSource("True/False");
        QuestionSource essaySource= new BankQuestionSource("Essay");
        QuestionSource progSource = new BankQuestionSource("Programming");

        // ─────────────────────────────────────────────────────────────────
        // STEP 3: Abstract Factories — inject sourcing strategies
        // ─────────────────────────────────────────────────────────────────
        QuestionFactory mcqFactory  = new MCQFactory(mcqSource);
        QuestionFactory tfFactory   = new TrueFalseFactory(tfSource);
        QuestionFactory essFactory  = new EssayFactory(essaySource);
        QuestionFactory progFactory = new ProgrammingFactory(progSource);

        // ─────────────────────────────────────────────────────────────────
        // STEP 4: Builder — chain fluent API to construct configuration
        // ─────────────────────────────────────────────────────────────────
        ExamConfiguration config = new ExamBuilder()
                .setTitle("OOP Midterm Exam")
                .setDuration(60)
                .setPassingScore(50)
                .enableNegativeMarking()
                .enableQuestionShuffle()
                .enableAutoSubmit()
                .build();  // calculatorAllowed stays false

        // ─────────────────────────────────────────────────────────────────
        // STEP 5: Generate questions
        // ─────────────────────────────────────────────────────────────────
        List<Question> questions = new ArrayList<>();
        questions.add(mcqFactory.createQuestion());
        questions.add(mcqFactory.createQuestion());
        questions.add(essFactory.createQuestion());
        questions.add(progFactory.createQuestion());
        questions.add(tfFactory.createQuestion());

        // ─────────────────────────────────────────────────────────────────
        // STEP 6: Dashboard Summary
        // ─────────────────────────────────────────────────────────────────
        printDashboard(exam, config, questions, mcqSource.getStrategyName());
    }

    private static void printDashboard(Exam exam, ExamConfiguration cfg,
                                       List<Question> questions, String strategy) {
        String sep = "=====================================================================";
        System.out.println(sep);
        System.out.println("  EXAM CREATED SUCCESSFULLY");
        System.out.println(sep);
        System.out.printf("Type           : %s%n",  exam.getType());
        System.out.printf("Title          : %s%n",  cfg.getTitle());
        System.out.printf("Duration       : %d minutes%n", cfg.getDuration());
        System.out.printf("Passing Score  : %d Marks%n",   cfg.getPassingScore());
        System.out.println();
        System.out.println("Configuration Profiles:");
        System.out.println("  " + flag(cfg.isNegativeMarking())  + " Negative Marking Enabled");
        System.out.println("  " + flag(cfg.isQuestionShuffle())  + " Question Shuffle Activated");
        System.out.println("  " + flag(cfg.isCalculatorAllowed())+ " Embedded Calculator Allowed");
        System.out.println("  " + flag(cfg.isAutoSubmit())       + " Auto-Submit On Timeout");
        System.out.println();
        System.out.println("Question Sourcing Strategy: " + strategy);
        System.out.println();
        System.out.println("Compiled Structural Components:");
        for (Question q : questions) {
            System.out.printf("  - [Type: %-12s] Points: %-3d Difficulty: %s%n",
                    q.getType(), q.getPoints(), q.getDifficulty());
        }
        System.out.println(sep);
    }

    private static String flag(boolean val) {
        return val ? "\u2713" : "\u2717";
    }
}
