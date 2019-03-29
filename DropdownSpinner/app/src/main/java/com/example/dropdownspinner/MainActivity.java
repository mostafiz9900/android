package com.example.dropdownspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=(Spinner) findViewById(R.id.spinner);
        loadSpinner();

    }
    public void loadSpinner(){
        List<String> lists=new ArrayList<String>();
        lists.add("Java");
        lists.add("xml");
        lists.add("spring");
        lists.add("android");
        ArrayAdapter<String> datdAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,lists);
        datdAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(datdAdapter);
    }
}