package com.example.preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class logeado extends AppCompatActivity {
    private TextView et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeado);
        et1 = findViewById(R.id.usuario);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        et1.setText(preferences.getString("mail",""));
    }
}
