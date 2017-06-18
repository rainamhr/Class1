package com.study.class1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button luffy, zoro, nami, usopp, chopper, sanji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery);

        luffy = (Button) findViewById(R.id.pic);
        zoro = (Button) findViewById(R.id.pic1);
        nami = (Button) findViewById(R.id.pic3);
        usopp = (Button) findViewById(R.id.pic4);
        chopper = (Button) findViewById(R.id.pic5);
        sanji = (Button) findViewById(R.id.pic6);

        luffy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                startActivity(intent);
            }
        });
        zoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, ZoroActiity.class);
                startActivity(intent);
            }
        });
        nami.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main4Activity.this, NamiActivity.class);
                startActivity(intent);
            }
        });
    }

}
