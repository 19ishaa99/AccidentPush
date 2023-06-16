package com.example.accidentpushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView aboutText = (TextView) findViewById(R.id.text);
        aboutText.setText ("");

    }
    public void register(View view){
        Intent i = new Intent(this,RegisrtrationForm.class);
        startActivity(i);
    }
}