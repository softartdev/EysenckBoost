package com.example.artur.eysenckboost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    TextView txtQuestion;
    ImageView imgQuestion;
    EditText edtAnswer;
    Button btnAnswer;
    Button btnNext;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        txtQuestion = (TextView)findViewById(R.id.question_text_view);
        imgQuestion = (ImageView)findViewById(R.id.question_image_view);
        edtAnswer = (EditText)findViewById(R.id.answer_edit_text);
        btnAnswer = (Button)findViewById(R.id.answer_button);
        btnNext = (Button)findViewById(R.id.next_button);
        btnShow = (Button)findViewById(R.id.show_answer_button);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialogManager.showAlertDialog(TestActivity.this, getString(R.string.answer));
            }
        });
    }
}
