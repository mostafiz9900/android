package com.example.layoutcycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, pass;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.editText3);
        pass=(EditText) findViewById(R.id.editText4);
        button=(Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb=new StringBuffer();
                sb.append(name.getText().toString()+"\n");
                sb.append(pass.getText().toString()+"\n");
                Toast toast=Toast.makeText(getApplicationContext(),sb.toString(), Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
