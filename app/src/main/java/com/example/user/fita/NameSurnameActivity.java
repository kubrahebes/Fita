package com.example.user.fita;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.fita.model.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class NameSurnameActivity extends AppCompatActivity {
    EditText userName, password, userEmail;
    public boolean flag = false;

    DatabaseReference myRef;
    FirebaseDatabase database;
    private FirebaseAuth mAuth;
    private ProgressDialog mProgress;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_surname);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("database");
        mAuth = FirebaseAuth.getInstance();

        userName = findViewById(R.id.user_name);
        userEmail = findViewById(R.id.eMail);
        password = findViewById(R.id.password);

        Button nameSurnameNextButton = (Button) findViewById(R.id.name_surname_next_button);
        nameSurnameNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getusers();


            }
        });

        // Intent intent=new Intent(NameSurnameActivity.this,MainActivity.class);
        // startActivity(intent);
    }
    public void getusers() {
        mAuth.createUserWithEmailAndPassword(userEmail.getText().toString(), password.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(NameSurnameActivity.this, "Signup Success!", Toast.LENGTH_SHORT).show();

                            //create a table in the firebase and add the new user information

                            FirebaseUser user = mAuth.getCurrentUser();
                            User newUser = new User(userName.getText().toString(), userEmail.getText().toString(), password.getText().toString(), user.getUid());
                            myRef.child("users").child(user.getUid()).setValue(newUser);
                            editor.putString("userName",userName.getText().toString());
                            Intent second = new Intent(NameSurnameActivity.this, AgeActivity.class);
                            startActivity(second);
                            // saveUser(newUser);
                            // come back to login screen

                        } else if (!task.isSuccessful() && flag) {

                            Toast.makeText(NameSurnameActivity.this, "Email address wrong or your password is too easy please change your password.", Toast.LENGTH_SHORT).show();
                        }

                    }

                });

    }
}
