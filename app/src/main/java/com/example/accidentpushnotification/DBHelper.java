package com.example.accidentpushnotification;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private  final String DBNAME = "AccidentNotification.db";

    public DBHelper(Context context) {
        super(context, "AccidentNotification.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //write logic to create tables
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //create logic to drop tables
    }
}
