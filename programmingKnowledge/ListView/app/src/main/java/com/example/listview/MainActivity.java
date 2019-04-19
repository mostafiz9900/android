package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static ListView listView;
private static String[] NAME=new String[] {"Mostafiz", "Sofiq", "Mortuza" , "Mahabub", "Arefin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView();
    }

    public void listView(){
        listView =(ListView) findViewById(R.id.nameList);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, R.layout.name_list,NAME);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value =(String) listView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this, "Position "+position+" value", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
