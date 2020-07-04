package com.example.a3_buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editTextTextPersonName);
        Button button = (Button) findViewById(R.id.bttn);
        textView = (TextView) findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        textView.setText("");
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);
            }
        };
        if(button != null) {
            button.setOnClickListener(ourOnClickListener);
        }

    }
}