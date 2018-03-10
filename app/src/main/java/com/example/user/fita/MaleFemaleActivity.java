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
        Button button = (Button) findViewById(R.id.erkek_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent second = new Intent(MaleFemaleActivity.this, AgeActivity.class);
                startActivity(second);


            }
        });
    }
}
