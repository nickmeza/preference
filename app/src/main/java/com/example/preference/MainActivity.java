package com.example.preference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= findViewById(R.id.email);
        et2= findViewById(R.id.pass);
        next = findViewById(R.id.button);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        if (preferences!= null){
            Intent next = new Intent(this,logeado.class);
            startActivity(next);
        }
    }
    public void siguiente(View v){
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor= preferencias.edit();
        editor.putString("mail",et1.getText().toString());
        editor.commit();
        finish();
        Intent next = new Intent(this,logeado.class);
        startActivity(next);
    }
}
