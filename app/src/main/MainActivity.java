package com.example.jalsanrakshan;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    ProgressDialog progressDialog;
    EditText email, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginuser(View view) {

        progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("Please Wait");
        progressDialog.setMessage("loading..");

        progressDialog.show();
        if (email.getText().toString().isEmpty()) {
            email.setError("Email is empty");
            email.requestFocus();
            progressDialog.dismiss();
        }
        if (pass.getText().toString().isEmpty()) {
            pass.setError("Password  is empty");
            pass.requestFocus();
            progressDialog.dismiss();
        }
        else {
            Intent i = new Intent(MainActivity.this, home.class);
            startActivity(i);
            finish();
        }
    }
    public void Signup_user (View view){
        Intent i = new Intent(MainActivity.this, Signupuser.class);
        startActivity(i);
        finish();
    }
    public void userforget (View view)
    {
        Intent i = new Intent(MainActivity.this, Forgetpassuser.class);
        startActivity(i);
    }
}
