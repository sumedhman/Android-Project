package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //here you will write the code
        //Activity life cycle method
        Toast.makeText(this, "This is onCreate calling", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "This is onStart calling", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "This is onResume calling", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "This is onPause calling", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "This is onStop calling", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "This is onDestroy calling", Toast.LENGTH_SHORT).show();
    }
    //Activity life cyle end

    //Intent
    //Explicite Intent

    //navigate from mainActivity to another SecondActivity
    //
    public void secondActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);

    }


}