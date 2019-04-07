package com.example.broadcastrececerex;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, cancel;
    CheckBox chk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add=(Button) findViewById(R.id.btnAdd);
        cancel=(Button) findViewById(R.id.btnCancel);
        chk=(CheckBox) findViewById(R.id.checkBox);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAlerts();

            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelAlerts();
            }
        });
    chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked){
                startAlerts();
            }else {
                cancelAlerts();
            }
        }
    });
    }
    PendingIntent pendingIntent;
    public void startAlerts(){
        EditText text=(EditText) findViewById(R.id.editText);
        int i=Integer.parseInt(text.getText().toString());
        Intent intent=new Intent(this, MyBroadCastReciv.class);
        pendingIntent= PendingIntent.getBroadcast(this.getApplicationContext(),234324243, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager am=(AlarmManager) getSystemService(ALARM_SERVICE);
        am.setRepeating(AlarmManager.RTC_WAKEUP,(i*1000),(50*1000),pendingIntent);
        Toast.makeText(this, "Alarm set in "+ i + " seconda", Toast.LENGTH_SHORT).show();
    }


    public void cancelAlerts(){
        EditText text=(EditText) findViewById(R.id.editText);
        int i=Integer.parseInt(text.getText().toString());
        Intent intent=new Intent(this, MyBroadCastReciv.class);
        pendingIntent= PendingIntent.getBroadcast(this.getApplicationContext(),234324243, intent, PendingIntent.FLAG_CANCEL_CURRENT);
        AlarmManager am=(AlarmManager) getSystemService(ALARM_SERVICE);
        am.setRepeating(AlarmManager.RTC_WAKEUP,(i*1000),(50*1000),pendingIntent);
        Toast.makeText(this, "Alarm cancel ", Toast.LENGTH_SHORT).show();
    }
}
