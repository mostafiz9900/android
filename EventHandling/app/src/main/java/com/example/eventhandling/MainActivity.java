package com.example.eventhandling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.button);
        button2=(Button) findViewById(R.id.button2);

        button.setOnClickListener(new ActionHandler());
        button2.setOnClickListener(new ActionHandler());
    }
    private class ActionHandler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
                Button b=(Button) v;
            String buttontext=b.getText().toString();
            Toast.makeText(getApplicationContext(),"you click",Toast.LENGTH_LONG).show();

        }
    }
    public void chooseAction(View v){
        Button b=(Button) v;
        String buttontext=b.getText().toString();
        Toast.makeText(getApplicationContext(),"you click",Toast.LENGTH_LONG).show();

    }
}
