import java.util.ArrayList;

public class Game {


    private ArrayList<Questions> questions;
    public Game(){

        questions= new ArrayList<Questions>(); //creating new array list of questions
        String question="What is 20 percent of 30 Dollars?";
        String[] answers= {"Enter the correct answer "};
        questions.add(new Questions(question,answers,"30"));
        question="Which of the follwing can be aranged into a 5-letter engligh word";
        answers=  new String[]{" H R G S T ", "R I L S A","T O O M T ", " W Q R G S" };  //must use new keyword since we are not initializing here
        questions.add(new Questions(question,answers,"Answer:  R I L S A (rails and motto)"));









    }


}
