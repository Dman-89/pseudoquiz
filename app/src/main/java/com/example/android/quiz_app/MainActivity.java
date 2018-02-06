package com.example.android.quiz_app;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String AnswerFor1 = "this is the right answer for 1 question";
    String AnswerFor3 = "this is the right answer for 3 question";
    int countCorrect = 0;

    public void getAnswer1(View view){
        TextView textView = (TextView) findViewById(R.id.res_q1);
        EditText editText = (EditText) findViewById(R.id.answer_question_1);
        String answer1 = editText.getText().toString();
        if(answer1.equals(AnswerFor1)){
            textView.setText("Right");
            countCorrect += 1;
        } else textView.setText("Wrong");

        getAnswer2(view);
        getAnswer3(view);
        getAnswer4(view);

        Context context = getApplicationContext();
        CharSequence text = "You answered " + countCorrect + " questions correctly";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void getAnswer2(View v){
        CheckBox box2 = (CheckBox) findViewById(R.id.answer_question_3_2);
        CheckBox box3 = (CheckBox) findViewById(R.id.answer_question_3_3);


        boolean res = box2.isChecked() && box3.isChecked();

        TextView textView = (TextView) findViewById(R.id.res_q2);

        if(res) {
            textView.setText("Right");
            countCorrect += 1;
        } else textView.setText("Wrong");
    }

    public void getAnswer3(View v){
        TextView textView = (TextView) findViewById(R.id.res_q3);
        EditText editText = (EditText) findViewById(R.id.answer_question_3);
        String answer1 = editText.getText().toString();
        if(answer1.equals(AnswerFor3)){
            textView.setText("Right");
            countCorrect += 1;
        } else textView.setText("Wrong");
    }

    public void getAnswer4(View v){
        TextView textView = (TextView) findViewById(R.id.res_q4);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radio_1);

        if(radioButton.isChecked()){
            textView.setText("Right");
            countCorrect += 1;
        } else textView.setText("Wrong");
    }
}

