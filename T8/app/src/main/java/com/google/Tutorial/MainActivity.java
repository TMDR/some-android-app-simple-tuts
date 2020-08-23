package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private ArrayAdapter aAdapter;
    private String[] users = { "John", "Mary", "George", "Lisa", "Sarah", "Ben"};
    private ImageView image;
    private String Image ;
    private Map<String,Integer> ids = new HashMap<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.userlist);
        aAdapter = new ArrayAdapter(this,R.layout.item_list, users);
        mListView.setAdapter(aAdapter);
        ids.put("ImageView"+1,R.id.imageView1);
        ids.put("ImageView"+2,R.id.imageView2);
        ids.put("ImageView"+3,R.id.imageView3);
        ids.put("ImageView"+4,R.id.imageView4);
        ids.put("ImageView"+5,R.id.imageView5);
        ids.put("ImageView"+6,R.id.imageView6);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                position+=1;
                image= (ImageView) findViewById(ids.get("ImageView"+position));
                image.setVisibility(View.VISIBLE);
                Log.i("visibile",""+position);
            }
        });
    }
}





