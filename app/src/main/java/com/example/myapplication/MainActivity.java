package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn_prueba);
        Button btn2 = findViewById(R.id.btn_prueba2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                /*Toast.makeText(MainActivity.this, "Le diste al click", Toast.LENGTH_SHORT).show();*/
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber = "062517727";
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
                /*Toast.makeText(MainActivity.this, "Prueba 2", Toast.LENGTH_SHORT).show();*/
            }
        });
    }

    public void Prueba3(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
        /*Toast.makeText(MainActivity.this, "Prueba 3", Toast.LENGTH_SHORT).show();*/

    }
}