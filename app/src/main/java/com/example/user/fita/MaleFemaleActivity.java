package com.example.user.fita;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MaleFemaleActivity extends AppCompatActivity {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female);

        pref = getSharedPreferences("MyPref", 0); // 0 - for private mode
        editor = pref.edit();
        Button erkekButton = (Button) findViewById(R.id.erkek_button);
        Button kadinButton = (Button) findViewById(R.id.kadin_button);
        erkekButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                editor.putString("gender","erkek");
                Intent second = new Intent(MaleFemaleActivity.this, AgeActivity.class);
                startActivity(second);
            }
        });

        kadinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("gender","kadin");
                Intent intent = new Intent(MaleFemaleActivity.this, AgeActivity.class);
                startActivity(intent);
            }
        });

    }

}
