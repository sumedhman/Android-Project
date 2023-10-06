package com.example.mymenudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
        //return super.onCreateOptionsMenu( menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemID = item.getItemId();
        if (itemID==R.id.action_search){
            //logic for serach
            Toast.makeText("this is serach");

        }else if(itemId==R.id.){
            Toast.makeText(“you selected search”);
        }
       // Return super.onOptionItemSelected(item);
    }


        return super.onOptionsItemSelected(item);

    }
}