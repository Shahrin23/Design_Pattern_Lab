package exam.abstractfactory;

public class MCQRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[MCQ Renderer] " + q.getText());
        System.out.println("  (A) Option 1  (B) Option 2  (C) Option 3  (D) Option 4");
    }
}
