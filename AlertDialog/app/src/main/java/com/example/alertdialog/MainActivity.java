package com.example.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button one, two, three, four, five, six;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createObject();
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
    }

    public void createObject(){
        one=(Button) findViewById(R.id.button);
        two=(Button) findViewById(R.id.button2);
        three=(Button) findViewById(R.id.button3);
        four=(Button) findViewById(R.id.button4);
        five=(Button) findViewById(R.id.button5);
        six=(Button) findViewById(R.id.button6);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button){
            alertOne();
        }else if (v.getId()==R.id.button2){
            alertTwo();
        }else if (v.getId()==R.id.button3){
            alertThree();
        }else if (v.getId()==R.id.button4){
            alertFive();
        }else if (v.getId()==R.id.button5){
            alertFive();
        }
        else {
           alertSix();
        }
    }

    public void alertOne(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("One Button")
                .setMessage("This in one button Alert")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("one Button");
                    }
                }).show();

    }
    public void alertTwo(){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Two Button")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("This in two button Alert")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("Two Button");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("two clicked cancel");
                        dialog.cancel();
                    }
                }).show();

    }
    public void alertThree(){

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("three Button")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setMessage("This in three button Alert")
                .setPositiveButton("Right", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("three Button");
                        dialog.cancel();
                    }
                })
                .setNeutralButton("Center", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("You clicked Neutral");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Lefi", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        showToast("three clicked cancel");
                        dialog.cancel();
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
    public void alertFive(){}
    public void alertSix(){}


    public void showToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_LONG).show();
    }



}
