package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class New extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        setTheme(android.R.style.Theme_Translucent_NoTitleBar);
    }
}
