package com.example.sdayananda.rockpaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView input, output;
    Button rock, paper, scissors;
    int[] images = new int[]{
            R.drawable.rock,
            R.drawable.paper,
            R.drawable.scissors
    };
    int userinput = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (ImageView) findViewById(R.id.iv_input);
        output = (ImageView) findViewById(R.id.iv_output);
        rock = (Button) findViewById(R.id.btn_rock);
        paper = (Button) findViewById(R.id.btn_paper);
        scissors = (Button) findViewById(R.id.btn_scissors);

        rock.setOnClickListener(this);
        paper.setOnClickListener(this);
        scissors.setOnClickListener(this);
    }

    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btn_rock:
                userinput = 1;
                input.setBackgroundResource(R.drawable.rock);
                setOutput();
                break;
            case R.id.btn_paper:
                userinput = 2;
                input.setBackgroundResource(R.drawable.paper);
                setOutput();
                break;
            case R.id.btn_scissors:
                userinput = 3;
                input.setBackgroundResource(R.drawable.scissors);
                setOutput();
                break;
        }
    }

    public void setOutput() {
        int imageId = (int) (Math.random() * images.length);
        output.setBackgroundResource(images[imageId]);
        checkresult(imageId);
    }

    public void checkresult(int imageId) {
        if (userinput == 1 && imageId == 0) {     //User choose Rock,Computer choose Rock
            showresult(2);
        } else if (userinput == 1 && imageId == 1) { //User choose Rock,Computer choose Paper
            showresult(0);
        } else if (userinput == 1 && imageId == 2) { //User choose Rock,Computer choose Scissors
            showresult(1);
        } else if (userinput == 2 && imageId == 0) { //User choose Paper,Computer choose Rock
            showresult(1);
        } else if (userinput == 2 && imageId == 1) { //User choose Paper,Computer choose Paper
            showresult(2);
        } else if (userinput == 2 && imageId == 2) { //User choose Paper,Computer choose Scissors
            showresult(0);
        } else if (userinput == 3 && imageId == 0) {//User choose Scissors,Computer choose Rock
            showresult(0);
        } else if (userinput == 3 && imageId == 1) { //User choose Scissors,Computer choose Paper
            showresult(1);
        } else if (userinput == 3 && imageId == 2) { //User choose Scissors,Computer choose Scissors
            showresult(2);
        }
    }


    public void showresult(int result) {
        if (result == 0) {
            Toast.makeText(getApplicationContext(), "You Lost!", Toast.LENGTH_SHORT).show();
        } else if (result == 1)
            Toast.makeText(getApplicationContext(), "You Won!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(getApplicationContext(), "It's a Tie!", Toast.LENGTH_SHORT).show();
    }



}