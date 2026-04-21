import java.util.Scanner;

public class QuestionService {
    Questions[] questions = new Questions[5];
    String[] answers = new String[5];

    public QuestionService(){
        questions[0] = new Questions(1, "What is this programming language?", "Java", "Python", "C++", "C#", "Java");
        questions[1] = new Questions(1, "What is this IDE?", "VSCode", "PyCharm", "InteliJ", "Eclipse", "InteliJ");
        questions[2] = new Questions(1, "What is the size of an int?", "1 byte", "4 byte", "8 bit", "16 bit", "4 byte");
        questions[3] = new Questions(1, "What is my legal name?", "Natanim Eibrahim", "Nati", "Natanim Issa", "Natanim", "Natanim Eibrahim");
        questions[4] = new Questions(1, "What was i doing?", "Eating", "Listening to Music", "Sleeping", "Programming", "Programming");

    }
    public void playQuiz(){
        System.out.println("#############################################################");
        System.out.println("#                   WELCOME TO PROJECT QUIZ                 #");
        System.out.println("#############################################################");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        for (Questions q: questions){
            System.out.println(q);
            System.out.println();
            System.out.println("Please submit your answer as shown in the option(Case Sensetive): ");
            answers[i] = sc.nextLine();
            i++;
            System.out.println();
        }

        System.out.println("#############################################################");
        System.out.println("Final Submitted Answers: ");
        for(int j=0; j<answers.length; j++){
            System.out.println(j+1 + " : " + answers[j]);
        }
    }

    public int calculateScore(){
        int score = 0;

        for(int i=0; i<questions.length; i++){
            if(questions[i].getAnswer().equals(answers[i]))
                score++;
        }
        return  score;
    }

    public void displayScore(){
        int score = calculateScore();
        System.out.println("#############################################################");
        System.out.println("                   You Scored: " + score + "/5               ");
        System.out.println("#############################################################");
    }
}
