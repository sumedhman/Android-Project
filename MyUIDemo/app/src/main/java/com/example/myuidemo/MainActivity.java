package com.example.myuidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1;
    EditText editText2;
    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText1=findViewById(R.id.editTextNumber);
         editText2=findViewById(R.id.editTextNumber2);
         textView=findViewById(R.id.mytext);
         btnAdd=findViewById(R.id.btnAdd);

         btnAdd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                  int firstNumber = Integer.parseInt(editText1.getText().toString());
                 int secondNumber = Integer.parseInt(editText2.getText().toString());
                 int result=firstNumber+secondNumber;

                 textView.setText(""+result);
             }
         });

    }
}