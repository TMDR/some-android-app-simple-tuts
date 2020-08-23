package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_details);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent intent = getIntent();
        TextView t = findViewById(R.id.textView3);
        t.setText(intent.getStringExtra(MainActivity.UserREQUEST));
        TextView ta = findViewById(R.id.tex);
        ta.setText(intent.getStringExtra(MainActivity.PassREQUEST));

    }
}
