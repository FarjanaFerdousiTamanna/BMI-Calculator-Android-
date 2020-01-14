package com.tamanna.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height, nameEditText;
    TextView resultText;
    String calculation, BMIresult, name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        nameEditText = findViewById(R.id.nameEditText);
        resultText = findViewById(R.id.resultTextView);
        nameEditText = findViewById(R.id.nameEditText);
    }

    public void CalculateBMI(View view) {
        name = nameEditText.getText().toString();
        String S1 = weight.getText().toString();
        String S2 = height.getText().toString();

        Double weightvalue = Double.parseDouble(S1);
        Double heightvalue = Double.parseDouble(S2) * .3048;

        Double bmi = weightvalue / (heightvalue * heightvalue);

        if (bmi <= 14.9) {
            BMIresult = "Very severely underweight";
        } else if (bmi >= 15 && bmi <= 15.9) {
            BMIresult = "Severely underweight";
        } else if (bmi >= 16 && bmi <= 18.5) {
            BMIresult = "Underweight";
        } else if (bmi >= 18.6 && bmi <= 25) {
            BMIresult = "Normal";
        } else if (bmi >= 25.1 && bmi <= 30) {
            BMIresult = "Overweight";
        } else if (bmi >= 30.1 && bmi <= 35) {
            BMIresult = "Moderately obese";
        } else if (bmi >= 35.1 && bmi <= 40) {
            BMIresult = "Severely obese";
        } else if (bmi >= 40.1) {
            BMIresult = "Very severely obese";
        }

        calculation = "Result: \n " + bmi + "\n" + name +","+" " + "your weight is"+" "+ BMIresult;

        resultText.setText(calculation);
    }
}
