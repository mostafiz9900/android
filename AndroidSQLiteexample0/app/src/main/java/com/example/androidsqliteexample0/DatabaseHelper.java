package com.example.androidsqliteexample0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final int DATABASE_VERSION=1; /*it is define vertion chack*/
    private static final String DATABASE_NAME="userInfo"; /*storase data this naeme*/
    private static final String TABLE_NAME="user";

    /*All module class file diclaration*/

    private static final String KEY_ID="id";
    private static final String KEY_NAME="name";
    private static final String KEY_PHONE="phone_number";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_USER_INFO_TABLE="CREATE TABLE "+TABLE_NAME +"(" + KEY_ID + "INTEGER PRIMARY KEY, "+ KEY_NAME + "TEXT, "+KEY_PHONE+"TEXT )";
        db.execSQL(CREATE_USER_INFO_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addUserInfo(UserInfo info){
        SQLiteDatabase database=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(KEY_NAME, info.getName());
        values.put(KEY_PHONE, info.getPhone_number());
        database.insert(TABLE_NAME,null, values);
        database.close();
    }
    public List<UserInfo> getallUser(){
        List<UserInfo> userList=new ArrayList<UserInfo>();
        String sql="Select * from "+ TABLE_NAME;
        SQLiteDatabase database=this.getWritableDatabase();
        Cursor cursor=database.rawQuery(sql,null);
        if (cursor.moveToFirst()){
            do {
                UserInfo info=new UserInfo();
                info.setId(Integer.parseInt(cursor.getString(0)));
                info.setName(cursor.getString(1));
                info.setPhone_number(cursor.getString(2));
                userList.add(info);
            }while (cursor.moveToNext());
        }
        return userList;
    }
}
