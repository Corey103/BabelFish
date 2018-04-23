package com.example.corey.androidstudioproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.TextView;


public class Ending extends AppCompatActivity {
    private Button button;
    private Button button2;
    private TextView scoreAmount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        button = findViewById(R.id.continueButton);
        button2 = findViewById(R.id.mainButton);
        Intent mIntent = getIntent();
        scoreAmount = (TextView)findViewById(R.id.scoreAmount);
        int scoreInt = getIntent().getIntExtra("score", 0);
            scoreAmount.setText(Integer.toString(scoreInt));
    }
    public void StartMain(View v){
        Intent startMain = new Intent(this, MainActivity.class);
        startActivity(startMain);
    }
    public void StartContinue(View v){
        Intent startContinue = new Intent(this, StartGame.class);
        startActivity(startContinue);
    }
}
