package com.example.accidentpushnotification;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Home extends AppCompatActivity implements AdapterView.OnItemClickListener{
    public String [] My_list;
    private ActionBarDrawerToggle drawerListener;
    private  ListView leftList;

    public void onCall(View view){
        startActivity(new Intent(android.content.Intent.ACTION_DIAL,
                Uri.parse("tel:+0659-268-446")));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView listview = (ListView) findViewById(R.id.Drawer);
        My_list = getResources().getStringArray(R.array.ourItems);
        ArrayAdapter leftAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, My_list);
        listview.setAdapter(leftAdapter);
        listview.setOnItemClickListener(this);

    }
    //public boolean onCreateOptionsMenu(Menu menu){
        //getMenuInflater().inflate(R.menu.,My_list);
    //}


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case  0:
                Intent intent = new Intent(this,Home.class);
                startActivity(intent);
                break;
            case 1:
                /*
                Intent intent1 = new Intent(this, Location.class);
                startActivity(intent1);
                */
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Location()).setReorderingAllowed(true).commit();
                break;
            case 2:
                Intent intent2 = new Intent(this,MainActivity.class);
                startActivity(intent2);
                break;
        }
        //Toast.makeText(this,My_list[(int) id],Toast.LENGTH_SHORT).show();
    }

}
