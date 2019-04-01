package com.example.sqliteexam;

import android.content.Context;
import android.widget.Toast;

public class Message {
    public static void messages(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
