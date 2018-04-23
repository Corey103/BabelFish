package com.example.corey.androidstudioproject;
// Some code used from Tihomir RAdeff.


public class QuestionDatabase {
    public String questionDB[] = {
    "Translate the following: '¿Hablo Corey español?\n", "Translate the word 'Juegos'",
            "Translate the word 'Perdón'", "How do you say 'My name is...'",
            "What is the number '4' in spanish?", "How do you 'I am...'"

    };
    private String choiceDatabase[][] = {
        {"Is Corey Spanish?", "Does Corey speak Spanish?", "Is Corey learning Spanish?", "Does Corey speak English?"},
        {"Books", "Cards", "Library", "Games"},
        {"Please", "Excuse Me", "Sorry", "How are you"},
        {"Yo llamo Corey", "Te llamo Corey", "Me llamo Corey", "Yo Soy Corey"},
        {"Cuatro", "Tres", "Cinco", "Diez"},
        {"Me llamo Corey", "Yo soy Corey", "Yo te Corey", "Me Soy Corey"},
    };

    private String correctAnswer[] = {"Does Corey speak Spanish?", "Games", "Excuse Me", "Me llamo Corey",
            "Cuatro", "Yo soy Corey"};


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
