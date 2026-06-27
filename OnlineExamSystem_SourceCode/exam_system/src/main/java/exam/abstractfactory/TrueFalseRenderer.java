package exam.abstractfactory;

public class TrueFalseRenderer implements QuestionRenderer {
    @Override
    public void render(Question q) {
        System.out.println("[True/False Renderer] " + q.getText());
        System.out.println("  (T) True   (F) False");
    }
}
