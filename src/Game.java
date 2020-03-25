import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {


    private ArrayList<Questions> questions;
    public Game(){

        questions= new ArrayList<Questions>(); //creating new array list of questions
        String question="What is 20 percent of 30 Dollars?";  //1
        String[] answers= {"Enter the correct answer "};
        questions.add(new Questions(question,answers,"6"));
        question="Which of the follwing can be aranged into a 5-letter engligh word";  //2
        answers=  new String[]{"MULTIPLE ANSWERS. ENTERS LETTERS TOGETHER  if answer is a and c enter AC","A.  H R G S T ", "B.  R I L S A","C.  T O O M T ", "D.  W Q R G S" };  //must use new keyword since we are not initializing here
        questions.add(new Questions(question,answers," BC"));
        question="Book is to reading as Fork is to "; //3
        answers= new String[]{"A. drawing","B. writing", "C. stirring", "D. eating"};
        questions.add(new Questions(question,answers,"D"));
        question= "If there are 6 apples ans you take away 4 how many do you have? "; //4
        answers= new String[]{"Enter the correct answer "};
        questions.add(new Questions(question,answers,"4")); //5
        question="Finger is to hand as Leaf is to?";
        answers=new String[]{"A. Twig","B. Tree","C. Branch","D. Blossom","E. Bark"};
        questions.add(new Questions(question,answers,"A"));
        question="Which one of the following is least like the others"; //6
        answers=new String[]{"A. Poem","B. Novel","C. Painting", "D. Statue","E. Flower"};
        questions.add(new Questions(question,answers,"E"));
        question="At a meeting of four people they shake hands with each other how many handshakes are possible?"; //7
        answers=new String[]{"A. 4","B. 5","C. 6","D. 7","E. 8"};
        questions.add(new Questions(question,answers,"C"));
        question="What is the result of this sum 16 X 63 - 1214?"; //8
        answers= new String[]{"A. 206","B. -206","C. 306","D. 18416"};
        questions.add(new Questions(question,answers,"B"));
        question="What is the meaning of the phrase \"A rolling stone gathers no moss \""; //9
        answers= new String[]{"A. Continuing is better than quitting with something", "B. Someone who does not settle" +
                "in one place rarley prospers ","C. Experience is growing over the years","D. Moving parts do not rust"};
        questions.add(new Questions(question,answers,"B"));
        question="Which sentance is correct? \"Who's cat is this? \" or \" Whose cat is this\""; //10
        answers=new String[]{"A.\"Who's cat is this? \" ", "B.\" Whose cat is this\"\""};
        questions.add(new Questions(question,answers,"A"));
        Collections.shuffle(questions, new Random());

    }
public void start(){
    Scanner scan= new Scanner(System.in);
    int correctAns=0;
    for(int i=0;i<questions.size();i++){
        System.out.println(i+1 +" . "+questions.get(i).getQuestion());   //this loop goes through the array list and shows the questions
        int answerChoices=questions.get(i).getAnswerChoicesList().size();  //gets the number of choices

        for(int j=0;j<answerChoices;j++){
            System.out.println(questions.get(i).getAnswerChoicesList().get(j));
        }
        String userAnswer=scan.nextLine().toUpperCase();    //this is the answer the user enters it will be converted to uppercase each time
        ArrayList<String> choices=questions.get(i).getAnswerChoicesList();
        String rightAns=questions.get(i).getAnswer();
       // System.out.println(rightAns);

       if(userAnswer.equals(rightAns)){         /**if the answer entered by the user and correct answer are the same number of
                                                         correct answers increments by one */

           correctAns++;

       }

    }
    scan.close();
    System.out.println("You got "+ correctAns+ " correct answers");

    System.out.println("Scoring System: \n" +
            "10 Correct 150-200 (Genius)\n 9 Correct 140-149 \n 8 Correct 130-139 \n 7 Correct 120-129 \n 6 Correct 110-119\n 5 Correct 100-109 (Average) \n 4 Correct 90-99\n 3 Correct 80-89\n 2 Correct 70-79\n 1 Correct 60-69\n 0 Correct 0-59 (Not Good)");

}


}
