package com.google.Tutorial;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int Ac2RequestCode = 1;
    private String hell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ac2();
            }
        });
    }
    private void Ac2(){
        Intent intent = new Intent(this,Ac2.class);
        startActivityForResult(intent,Ac2RequestCode);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == Ac2RequestCode){
            if (resultCode == RESULT_OK){
                hell=data.getData().toString();
                makeMessage();
            }
        }
    }
    private void makeMessage(){
        LayoutInflater l = (LayoutInflater) this.getSystemService(this.LAYOUT_INFLATER_SERVICE);
        View v =  l.inflate(R.layout.activity_main,null);
        TextView t =  findViewById(R.id.textView);
        t.setText(hell);
    }
}
