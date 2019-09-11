package com.example.androidchangescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class empty2 extends AppCompatActivity {
    Button bt1ao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty2);
        bt1ao = (Button) findViewById(R.id.btAo);
        bt1ao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(empty2.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}

