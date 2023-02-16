package com.ca.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.Month;

public class MainActivity extends AppCompatActivity {
    int c, i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextLoanAmount = findViewById(R.id.loan);
        EditText editTextInterestRate = findViewById(R.id.rate);
        EditText editTextMonths = findViewById(R.id.months);
        Button button = findViewById(R.id.Ans);
        TextView textView = findViewById(R.id.FinalAns);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float LoanAmount = Float.parseFloat(String.valueOf(editTextLoanAmount.getText()));
                float InterestRate = Float.parseFloat(String.valueOf(editTextInterestRate.getText()));
                float Months = Float.parseFloat(String.valueOf(editTextMonths.getText()));
               for (i=0; i<R.id.months; i++) {
                   c=c*(1+R.id.rate);
               }
               float EMI=R.id.loan*R.id.rate*(c/(c-1));
                textView.setText(String.valueOf("EMI="+EMI));

            }

        });

    }
}