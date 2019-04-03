package com.example.addingtwonumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view) {
        EditText e1 = (EditText) findViewById(R.id.txtNum1);
        EditText e2 = (EditText) findViewById(R.id.txtNum2);
        EditText e3 = (EditText) findViewById(R.id.txtThree);
        EditText t1 = (EditText) findViewById(R.id.txtResult);

        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e1.getText().toString());
        int num3 = Integer.parseInt(e3.getText().toString());
        int sum = num1 + num2;
        int sum2 = sum * num3;

        t1.setText(Integer.toString(sum2));
       
    }
}
