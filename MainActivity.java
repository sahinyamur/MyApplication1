package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myBTN = findViewById(R.id.myBtn);

        myBTN.setOnClickListener(v -> Toast.makeText(MainActivity.this, "You Clicked The Button"
        , Toast.LENGTH_SHORT).show());
    }
}