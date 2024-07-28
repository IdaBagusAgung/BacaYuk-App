package com.example.bacayuktubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
    }

    public void berita(View view) {
        Intent intent = new Intent(user.this, berita.class);
        startActivity(intent);
    }

    public void profil(View view) {
        Intent intent = new Intent(user.this, profil.class);
        startActivity(intent);
    }

    public void masukan(View view) {
        Intent intent = new Intent(user.this, masukkan.class);
        startActivity(intent);
    }
}