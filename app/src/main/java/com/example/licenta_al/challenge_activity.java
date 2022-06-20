package com.example.licenta_al;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class challenge_activity extends AppCompatActivity implements View.OnClickListener {

    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitButton;

    int score = 0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";

@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_challenge);

    totalQuestionsTextView = findViewById(R.id.total_questions);
    questionTextView = findViewById(R.id.question);
    ansA = findViewById(R.id.ans_A);
    ansB = findViewById(R.id.ans_B);
    ansC = findViewById(R.id.ans_C);
    ansD = findViewById(R.id.ans_D);
    submitButton = findViewById(R.id.submit_button);

    ansA.setOnClickListener(this);
    ansB.setOnClickListener(this);
    ansC.setOnClickListener(this);
    ansD.setOnClickListener(this);
    submitButton.setOnClickListener(this);

    totalQuestionsTextView.setText("Total questions : "+totalQuestion);

    loadNewQuestion();


}


    @Override
    public void onClick(View view) {

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);
        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_button) {

            if (selectedAnswer.equals(QuestionAnswer.correctAnswers[currentQuestionIndex])) {
                score++;
            }

            currentQuestionIndex++;
            loadNewQuestion();


        }else{
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.MAGENTA);

        }


    }

    void loadNewQuestion(){

    if(currentQuestionIndex == totalQuestion){
        finishQuiz();
        return;
    }

    questionTextView.setText(QuestionAnswer.question[currentQuestionIndex]);
    ansA.setText(QuestionAnswer.choices[currentQuestionIndex][0]);
    ansB.setText(QuestionAnswer.choices[currentQuestionIndex][1]);
    ansC.setText(QuestionAnswer.choices[currentQuestionIndex][2]);
    ansD.setText(QuestionAnswer.choices[currentQuestionIndex][3]);


    }
    void finishQuiz(){
        String passStatus = "";
        if (score > totalQuestion*0.50){ //if score passes 0.5x questions
            passStatus = "Passed!";
        }else{
            passStatus="Failed!";
        }
        new AlertDialog.Builder(this)
                .setTitle(passStatus)
                .setMessage("Score is "+ score + " out of "+ totalQuestion)
                .setNegativeButton("Restart",(dialogueinterface, i) ->restartQuiz() )
                .setPositiveButton("Done",(posdialogueinterface,d) ->exitQuiz())
                .setCancelable(false)
                .show();



    }
    void restartQuiz(){
        score = 0;
        currentQuestionIndex = 0;
        loadNewQuestion();
    }
    void exitQuiz(){
        score = 0;
        currentQuestionIndex = 0;
        finish();
    }


}
