package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final ArrayList<User> Users = new ArrayList<User>();
    public static final String UserREQUEST = "4";
    public static final String PassREQUEST = "6";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Users.add(new User("Someone","Pass1"));
        Users.add(new User("Someone2","Pass2"));
        Users.add(new User("Someone3","Pass3"));
        Users.add(new User("Someone4","Pass4"));
        UserAdapter flavorAdapter = new UserAdapter(this, Users);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(flavorAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent User = new Intent(MainActivity.this, ItemDetails.class);
                        User.putExtra(MainActivity.UserREQUEST,Users.get(i).getName());
                        User.putExtra(MainActivity.PassREQUEST,Users.get(i).getPassword());
                        startActivity(User);

            }
        });
    }
}
