package com.example.analogclockanddigitalclockexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.TextClock;

public class MainActivity extends AppCompatActivity {
private static Button button;
private static TextClock textClock;
private static DigitalClock digitalClock;
private static AnalogClock analogClock;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnButtonClickListenner();
    }
    public void OnButtonClickListenner(){
        button =(Button) findViewById(R.id.button);
        textClock=(TextClock) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textClock.getVisibility() ==TextClock.GONE){
                    textClock.setVisibility(TextClock.VISIBLE);

                }else {

                    textClock.setVisibility(TextClock.GONE);
                }
            }
        });
    }
}
