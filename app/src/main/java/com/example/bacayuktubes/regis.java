package com.example.bacayuktubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class regis extends AppCompatActivity {

    EditText email, username, password, repassword;
    Button signup, signin;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        username = (EditText) findViewById(R.id.username);
//        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        signup = (Button) findViewById(R.id.loginButton);
//        signin = (Button) findViewById(R.id.signupText);
        DB = new DBHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(user.equals("") ||pass.equals("") || repass.equals(""))
                    Toast.makeText(regis.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else
                    if(pass.equals(repass)){
                        Boolean checkuser = DB.checkusername(user);
                        if(checkuser==false){
                            Boolean insert = DB.insertData(user, pass);
                            if(insert==true){
                                Toast.makeText(regis.this, "Register succesfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), berita.class);
                            }else {
                                Toast.makeText(regis.this, "Register failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(regis.this, "User already exists! please sign in", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(regis.this, "Password not matching", Toast.LENGTH_SHORT).show();
                    }
            }
        });

//        signin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
////                startActivity(intent);
//            }
//        });
    }
    public void login(View view) {
        Intent intent = new Intent(regis.this, MainActivity.class);
        startActivity(intent);
    }
}