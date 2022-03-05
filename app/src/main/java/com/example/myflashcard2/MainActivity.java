package com.example.myflashcard2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.flashcard_question_textview);
        TextView option1 = findViewById(R.id.flashcard_option1_textview);
        TextView option2 = findViewById(R.id.flashcard_option2_textview);
        TextView option3 = findViewById(R.id.flashcard_option3_textview);




       option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option2.setBackgroundColor(getResources().getColor(R.color.red));
                option1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option3.setBackgroundColor(getResources().getColor(R.color.red));
                option1.setBackgroundColor(getResources().getColor(R.color.green));
            }
        });
        findViewById(R.id.background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                option1.setBackgroundColor(getResources().getColor(R.color.teal_200));
                option2.setBackgroundColor(getResources().getColor(R.color.teal_700));
                option3.setBackgroundColor(getResources().getColor(R.color.gray));
            }
        });





    }

}