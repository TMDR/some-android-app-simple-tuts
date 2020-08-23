package com.google.Tutorial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ac2 extends AppCompatActivity {

    public static final int Ac3RequestCode = 4;
    private String hell;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);
        Button b = findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoBackToMainActivity();
            }
        });
        Button b4 = findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ac3();
            }
        });
    }

    private void Ac3(){
        Intent intent = new Intent(this,Ac3.class);
        startActivityForResult(intent,Ac3RequestCode);
    }

    private void GoBackToMainActivity(){
        Intent data = new Intent();
        data.setData(Uri.parse("Message from Ac2"));
        setResult(RESULT_OK, data);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Ac2.Ac3RequestCode){
            if (resultCode == RESULT_OK){
                hell=data.getData().toString();
                makeMessage();
            }
        }
    }
    private void makeMessage(){
        LayoutInflater l = (LayoutInflater) this.getSystemService(this.LAYOUT_INFLATER_SERVICE);
        View v =  l.inflate(R.layout.activity_ac2,null);
        TextView t =  findViewById(R.id.textView2);
        t.setText(hell);
    }
}
