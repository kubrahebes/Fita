package com.example.user.fita;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.fita.fragments.HomeFragment;

public class LengthActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        pref = getSharedPreferences("Length", 0); // 0 - for private mode
        editor = pref.edit();
        Button lengthButton= findViewById(R.id.length_button);
        final EditText editText=findViewById(R.id.length_edit_text);
        lengthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putInt("length",editText.getInputType());
//                Intent intent=new Intent(LengthActivity.this,HomeFragment.class);
//                startActivity(intent);
                HomeFragment fragment = new HomeFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, fragment);
                transaction.commit();
                finish();
            }
        });
    }
}
