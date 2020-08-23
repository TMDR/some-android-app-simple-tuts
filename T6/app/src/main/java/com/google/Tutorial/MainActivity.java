package com.google.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this,"On Create",Toast.LENGTH_LONG).show();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Test","Testing");
        Log.d("Test","Testing");
        Log.i("Test","Testing");
        Log.v("Test","Testing");
        Log.w("Test","Testing");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"On ReStart",Toast.LENGTH_LONG).show();
        Log.e(TAG,"onRestart");
        Log.d(TAG,"onRestart");
        Log.i(TAG,"onRestart");
        Log.v(TAG,"onRestart");
        Log.w(TAG,"onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart");
        Log.d(TAG,"onStart");
        Log.i(TAG,"onStart");
        Log.v(TAG,"onStart");
        Log.w(TAG,"onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause");
        Log.d(TAG,"onPause");
        Log.i(TAG,"onPause");
        Log.v(TAG,"onPause");
        Log.w(TAG,"onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy");
        Log.d(TAG,"onDestroy");
        Log.i(TAG,"onDestroy");
        Log.v(TAG,"onDestroy");
        Log.w(TAG,"onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onDestroy");
        Log.d(TAG,"onDestroy");
        Log.i(TAG,"onDestroy");
        Log.v(TAG,"onDestroy");
        Log.w(TAG,"onDestroy");
    }

}
