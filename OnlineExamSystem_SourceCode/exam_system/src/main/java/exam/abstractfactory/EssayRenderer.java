package exam.abstractfactory;

public class EssayRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[Essay Renderer] " + q.getText());
        System.out.println("  Write your answer in the text area below. (Min 200 words)");
    }
}
