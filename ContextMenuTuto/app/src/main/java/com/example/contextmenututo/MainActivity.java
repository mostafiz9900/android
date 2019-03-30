package com.example.contextmenututo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    List<String> dataList=new ArrayList<>();
    ArrayAdapter arrayAdapter;
    String[] contextMenuArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);

        dataList.add("Bangladesh");
        dataList.add("Dhaka");
        dataList.add("Gagipur");
        dataList.add("Tangail");

        contextMenuArray= getResources().getStringArray(R.array.contaxtmenu);

        arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,dataList);
        listView.setAdapter(arrayAdapter);

        registerForContextMenu(listView);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId()== R.id.listView){
            AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) menuInfo;
            menu.setHeaderTitle(dataList.get(info.position));
          /*  String[] contextMenuArray= getResources().getStringArray(R.array.contaxtmenu);*/
            for (int i=0; i<contextMenuArray.length; i++){
                menu.add(Menu.NONE,i,i, contextMenuArray[i]);
            }
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        AdapterView.AdapterContextMenuInfo info= (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
      int itemIndex= item.getItemId();
     String menuname = contextMenuArray[itemIndex];
     String listItem=dataList.get(info.position);
        Toast.makeText(this,"menu name: "+menuname+" list Item ",Toast.LENGTH_SHORT).show();

        return true;
    }
}
