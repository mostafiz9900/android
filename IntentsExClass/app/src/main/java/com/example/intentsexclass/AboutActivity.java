package com.example.intentsexclass;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    Button exti, goog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textView=(TextView)findViewById(R.id.txtView);
        Intent i=getIntent();
        String nam=i.getExtras().getString("nn");
        textView.setText(nam);

        exti=(Button) findViewById(R.id.btnExit);
        exti.setOnClickListener(this);

        goog=(Button) findViewById(R.id.btngoogls);
        goog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                Uri.parse("https://www.google.com/");
                startActivity(intent);
            }
        });
    }
    public void exitAlart(){
        AlertDialog.Builder ala=new AlertDialog.Builder(this);
        ala.setTitle("Edkkfdkfjkdjkf");
        ala.setMessage("are you exit program ?");
       ala.setPositiveButton("ok", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialog, int which) {
              finish();
               Toast.makeText(AboutActivity.this, "Exit Button", Toast.LENGTH_SHORT).show();
           }
       }).show();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnExit){
            exitAlart();
        }else {
            return;
        }
    }
}
