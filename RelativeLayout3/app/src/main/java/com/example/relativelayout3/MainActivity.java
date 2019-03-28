package com.example.relativelayout3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button= (Button) findViewById(R.id.button3);
        button4= (Button) findViewById(R.id.button4);

        button.setOnClickListener(this);
        button4.setOnClickListener(this);

       /*
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello Android",Toast.LENGTH_LONG).show();

            }
        });*/
    }

    @Override
    public void onClick(View v) {
        Button b=(Button) v;
        String buttontext=b.getText().toString();
        Toast.makeText(getApplicationContext(), "You Click",Toast.LENGTH_LONG).show();
    }
}
