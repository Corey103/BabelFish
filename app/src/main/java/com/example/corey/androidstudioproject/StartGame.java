package com.example.corey.androidstudioproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class StartGame extends AppCompatActivity {
    public int score = 0;
    Button answer1, answer2, answer3, answer4;
    TextView question;
    Random r;
    private QuestionDatabase newQuestion = new QuestionDatabase();
    private int questionLength = newQuestion.questionDB.length;
    private String correctAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);
        r = new Random();
        question = (TextView) findViewById(R.id.question);
        setQuestion(r.nextInt(questionLength));
    }

    public void answer1(View v) {
        if (answer1.getText() == correctAnswer) {
            score++;
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Answer!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        }
    }

    public void answer2(View v) {
        if (answer2.getText() == correctAnswer) {
            score++;
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Answer!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        }
    }

    public void answer3(View v) {
        if (answer3.getText() == correctAnswer) {
            score++;
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Answer!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        }
    }

    public void answer4(View v) {
        if (answer4.getText() == correctAnswer) {
            score++;
            Toast.makeText(getApplicationContext(), "Correct!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Answer!",
                    Toast.LENGTH_SHORT).show();
            setQuestion(r.nextInt(questionLength));
        }
    }

    private void setQuestion(int n) {

        question.setText(newQuestion.getQuestion(n));
        answer1.setText(newQuestion.getAns1(n));
        answer2.setText(newQuestion.getAns2(n));
        answer3.setText(newQuestion.getAns3(n));
        answer4.setText(newQuestion.getAns4(n));
        correctAnswer = newQuestion.getCorrectAns(n);
    }
}

