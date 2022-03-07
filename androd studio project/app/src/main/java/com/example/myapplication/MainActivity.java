package com.example.cw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number1 = findViewById(R.id.firstnumber);
        EditText number2 = findViewById(R.id.secondnumber);
        Button calculate = findViewById(R.id.calculate);
        TextView total = findViewById(R.id.total);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNumbar = Integer.parseInt(number1.getText().toString());
                int secondNumber = Integer.parseInt(number2.getText().toString());
                int result = firstNumbar + secondNumber;
                total.setText(result + "");
            }
        });






    }
}