package com.example.user.fita;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NameSurnameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_surname);
        Button nameSurnameNextButton = (Button) findViewById(R.id.name_surname_next_button);
        nameSurnameNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NameSurnameActivity.this, MaleFemaleActivity.class);
                startActivity(intent);
            }
        });

        // Intent intent=new Intent(NameSurnameActivity.this,MainActivity.class);
        // startActivity(intent);
    }
}
