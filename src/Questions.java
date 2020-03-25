import java.util.ArrayList;

public class Questions {

    private String question;
    private ArrayList<String> answerChoicesList;
    private String answer;
    public Questions(String question, String[] answerChoices, String answer){

            this.question=question;
            this.answerChoicesList= new ArrayList<String>();
            for(int i=0;i< answerChoices.length;i++){                          //this loop takes the answer choices and puts it in the array list
                this.answerChoicesList.add(answerChoices[i]);
            }
            this.answer=answer;
    }

    public String getQuestion() {
        return question;
    }



    public ArrayList<String> getAnswerChoicesList() {
        return answerChoicesList;
    }


    public String getAnswer() {
        return answer;
    }

}
