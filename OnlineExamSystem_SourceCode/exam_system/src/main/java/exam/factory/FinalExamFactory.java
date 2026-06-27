package exam.factory;

public class FinalExamFactory extends ExamFactory {
    @Override
    public Exam createExam() {
        return new FinalExam();
    }
}
