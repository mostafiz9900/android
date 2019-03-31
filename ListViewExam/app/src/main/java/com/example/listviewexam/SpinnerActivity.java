package com.example.listviewexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;

    List<String> lists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=(Spinner) findViewById(R.id.spinner);

        loadSpinner();
         lists=new ArrayList<String>();
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

               Toast.makeText(SpinnerActivity.this, "You Slected  :"+lists.get(position), Toast.LENGTH_SHORT).show();
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });

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
