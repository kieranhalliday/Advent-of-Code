import java.util.ArrayList;

public class Bridge {

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        bridge.start();
    }


    // Client
    public void start() {

    }
}

interface Question {
    void nextQuestion();

    void previousQuestion();

    void newQuestion(String q);

    void deleteQuestion(String q);

    void displayQuestion();

    void displayAllQuestions();
}

class JavaQuestions implements Question {
    private ArrayList<String> questions = new ArrayList<>();
    private int currentQuestion = 0;

    JavaQuestions() {
        questions.add("What is Java");
        questions.add("What is OO programming");
        questions.add("What is the difference between Java and JavaScript");
    }

    @Override
    public void nextQuestion() {
        if (currentQuestion < questions.size() - 1) {
            currentQuestion++;
        }

        displayQuestion();

    }

    @Override
    public void previousQuestion() {
        if (currentQuestion > 0) {
            currentQuestion--;
        }

        displayQuestion();

    }

    @Override
    public void newQuestion(String q) {
        questions.add(q);

    }

    @Override
    public void deleteQuestion(String q) {
        questions.remove(q);

    }

    @Override
    public void displayQuestion() {
        System.out.println(questions.get(currentQuestion));

    }

    @Override
    public void displayAllQuestions() {
        for (String question : questions) {
            System.out.println(question);
        }

    }
}
