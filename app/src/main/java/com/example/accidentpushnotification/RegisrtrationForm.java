package com.example.accidentpushnotification;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisrtrationForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regisrtration_form);


        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // this event will enable the back
    // function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void RegisterNow(View view){
//        TextView uName = (TextView) findViewById(R.id.UserName1);
//        TextView lName = (TextView) findViewById(R.id.UserNAme2);
//        TextView phone = (TextView) findViewById(R.id.phoneNumber);
//        TextView NPassword = (TextView) findViewById(R.id.NewPassword);
//        TextView CPassword = (TextView) findViewById(R.id.ConfirmPassword);
//        EditText editText;
//        if (uName.length() == 0){
//            Toast.makeText(getApplicationContext(), "you must insert your first  name", Toast.LENGTH_SHORT).show();
//        }else if (lName.length() == 0){
//            Toast.makeText(getApplicationContext(), "you must insert your second                         name", Toast.LENGTH_SHORT).show();
//        }else if (phone.length() == 0){
//            Toast.makeText(getApplicationContext(), "you must insert your phone number", Toast.LENGTH_SHORT).show();
//        } else if (NPassword.length() == 0){
//            Toast.makeText(getApplicationContext(), "type your password", Toast.LENGTH_SHORT).show();
//        }else if (CPassword.length() == 0 ){
//            Toast.makeText(getApplicationContext(), "you must confirm your password", Toast.LENGTH_SHORT).show();
//        }else if (CPassword == NPassword){
//            Intent intent = new Intent(getApplicationContext(),Home.class);
//            startActivity(intent);
//        }
//        else{
//            Intent intent = new Intent(getApplicationContext(),Home.class);
//            startActivity(intent);
//            //Toast.makeText(getApplicationContext(), "password doesn't match,confirm again", Toast.LENGTH_SHORT).show();
//        }
    }
}