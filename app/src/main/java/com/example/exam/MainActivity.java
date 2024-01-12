package com.example.exam;



import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void submitAnswers(View view) {
        int answer1 = getAnswer(R.id.answer1);
        // Repeat similar code for other questions

        int correctAnswer1 = 5; // The correct answer for question 1
        // Repeat similar code for correct answers of other questions

        if (answer1 == correctAnswer1 /* && ... Check other answers */) {
            displayResults("Congratulations! All answers are correct.");
        } else {
            displayResults("Some answers are incorrect. Please review your answers.");
        }
    }
    private int getAnswer(int answerId) {
        EditText answerEditText = findViewById(answerId);
        String answerString = answerEditText.getText().toString();
        if (answerString.isEmpty()) {
            return 0; // Assume the default answer is 0 if the field is empty
        }
        return Integer.parseInt(answerString);
    }
    private void displayResults(String message) {
        TextView resultsTextView = findViewById(R.id.resultsTextView);
        resultsTextView.setText(message);
        showToast(message);
    }
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}