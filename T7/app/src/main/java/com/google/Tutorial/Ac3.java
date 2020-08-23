package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ac3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac3);
        Button b = findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoBackToMainActivity();
            }
        });
    }
    private void GoBackToMainActivity(){
        Intent data = new Intent();
        data.setData(Uri.parse("Message from Ac3"));
        setResult(RESULT_OK, data);
        finish();
    }
}
