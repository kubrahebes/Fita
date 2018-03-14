package com.example.user.fita;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WeightActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        pref = getSharedPreferences("Weight", 0); // 0 - for private mode
        editor = pref.edit();
        Button button = (Button) findViewById(R.id.weight_button);
        final EditText editText=findViewById(R.id.length_edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editor.putInt("weight",editText.getInputType());
                Intent second = new Intent(WeightActivity.this, LengthActivity.class);
                startActivity(second);
            }
        });
    }
}
