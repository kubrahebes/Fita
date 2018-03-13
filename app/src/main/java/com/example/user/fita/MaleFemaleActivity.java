package com.example.user.fita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaleFemaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female);
        Button erkekButton = (Button) findViewById(R.id.erkek_button);
        Button kadinButton=(Button) findViewById(R.id.kadin_button);
        erkekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(MaleFemaleActivity.this, AgeActivity.class);
                startActivity(second);
            }
        });

        kadinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MaleFemaleActivity.this,AgeActivity.class);
                startActivity(intent);
            }
        });

    }
}
