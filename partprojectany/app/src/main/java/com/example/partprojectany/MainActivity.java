package com.example.partprojectany;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, pass;
    Button btnlog, about;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.editText);
        pass=(EditText) findViewById(R.id.editText2);
        btnlog=(Button) findViewById(R.id.button);
        about=(Button) findViewById(R.id.btnAbout);

        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer sb=new StringBuffer();
                sb.append("name"+name.getText().toString()+"\n");
                sb.append("name"+pass.getText().toString()+"\n");
                Toast toast=Toast.makeText(getApplicationContext(),sb.toString(),Toast.LENGTH_LONG);
                toast.show();
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, aboutActivity.class);
                startActivity(intent);
            }
        });
    }
}
