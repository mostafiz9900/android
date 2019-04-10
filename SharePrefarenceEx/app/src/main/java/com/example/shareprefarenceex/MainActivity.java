package com.example.shareprefarenceex;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
EditText message;
SeekBar seekBar;
float fontSize;
String fontColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String test_info;

        message = findViewById(R.id.message);
        seekBar = findViewById(R.id.seek_bar);

        SharedPreferences sharedPreferences = MainActivity.this.getSharedPreferences(getString(R.string.PREE_FILE), MODE_PRIVATE);


    }
}
