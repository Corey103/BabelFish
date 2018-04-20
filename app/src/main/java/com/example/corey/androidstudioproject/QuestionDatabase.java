package com.example.corey.androidstudioproject;
// Some code used from Tihomir RAdeff.


public class QuestionDatabase {
    public String questionDB[] = {
    "What is 1+1?", "What is 2+2", "What is 3+3?", "What is 4+4", "What is 5+5", "What is 6+6"

    };
    private String choiceDatabase[][] = {
        {"1", "2", "3", "4"},
        {"1", "2", "3", "4"},
        {"3", "6", "9", "12"},
        {"2", "4", "6", "8"},
        {"3", "5", "7", "10"},
        {"6", "8", "10", "12"},
    };

    private String correctAnswer[] = {"2", "4", "6", "8", "10", "12"};


    // Do not modify below this line
    public String getQuestion(int q){
        String question = questionDB[q];
        return question;
    }

    public String getAns1(int a){
        String answer = choiceDatabase[a][0];
        return answer;
    }
    public String getAns2(int a){
        String answer = choiceDatabase[a][1];
        return answer;
    }
    public String getAns3(int a){
        String answer = choiceDatabase[a][2];
        return answer;
    }
    public String getAns4(int a){
        String answer = choiceDatabase[a][3];
        return answer;
    }

    public String getCorrectAns(int a){
        String correct = correctAnswer[a];
        return correct;
    }
}
