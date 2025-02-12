import java.util.Scanner;

public class QuizService {
    Question[] questions = new Question[5];
    String[] answers = new String[5];

    public QuizService(){
        questions[0] = new Question(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void displayQuestions(){
        int index=0;
        for(Question q: questions){
            System.out.println("Question " + q.getQuestionId());
            System.out.println(q.getQuestion());
            System.out.println("Options:");
            System.out.println("1. " + q.getOption1());
            System.out.println("2. " + q.getOption2());
            System.out.println("3. " + q.getOption3());
            System.out.println("4. " + q.getOption4());
            System.out.println("Enter your option here..");
            Scanner scanner = new Scanner(System.in);
            answers[index] = scanner.nextLine();
            index++;
        }

        System.out.println("Your answers are:");
        for(String a: answers){
            System.out.println(a);
        }
    }

    public int displayScore(){
        int score = 0;
        String correctAnswer;
        String userAnswer;

        for(int i=0;i< questions.length;i++){
            correctAnswer = questions[i].getAnswer();
            userAnswer = answers[i];

            if(correctAnswer.equals(userAnswer)){
                score++;
            }
        }
        return score;
    }
}
