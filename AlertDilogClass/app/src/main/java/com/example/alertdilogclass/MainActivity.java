package com.example.alertdilogclass;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=(Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button2){
            alertFour();
        }else {
            return;
        }
    }

    public void open(View view){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("button One ");
        builder.setMessage("Are you sure,ou wanted to make decision");
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
showToast("One Button");
            }
        }).show();
    }

    public void alertFour(){
        final  CharSequence[] itemss={"Samsung","oppo", "Htc","Nokia"};
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Make your selection");
        builder.setItems(itemss, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showToast("you choose "+ itemss[which]);
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public void showToast(String msg){
        Toast.makeText(getApplicationContext(), msg,Toast.LENGTH_LONG).show();
    }


}
