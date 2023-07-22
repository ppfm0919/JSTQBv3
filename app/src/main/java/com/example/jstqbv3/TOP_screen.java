package com.example.jstqbv3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TOP_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_screen);

        Button button = findViewById(R.id.startbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 目的のアクティビティに遷移するためのIntentを作成
                Intent intent = new Intent(TOP_screen.this, ApptestV1.class);
                // アクティビティを起動
                startActivity(intent);
            }
        });
    }
}

