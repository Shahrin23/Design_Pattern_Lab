package exam.abstractfactory;

public class ProgrammingRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        ProgrammingQuestion pq = (ProgrammingQuestion) q;
        System.out.println("[Programming Renderer | " + pq.getLanguage() + "] " + q.getText());
        System.out.println("  Write your code in the editor below.");
    }
}
