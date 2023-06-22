package com.example.accidentpushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.accidentpushnotification.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();
        setContentView(R.layout.activity_main); //make this as the entry point of the application

//        TextView aboutText = (TextView) findViewById(R.id.text);
//        aboutText.setText ("");

        //got to login page
//        Intent i = new Intent(this, LoginActivity.class);
//        startActivity(i);
    }
    public void register(View view){
        Intent i = new Intent(this,RegisrtrationForm.class);
        startActivity(i);
    }
}