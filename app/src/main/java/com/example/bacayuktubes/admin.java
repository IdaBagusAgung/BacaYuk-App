package com.example.bacayuktubes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void cekBerita(View view) {
            Intent intent = new Intent(admin.this, berita.class);
            startActivity(intent);
    }

    public void editBerita(View view) {
        Intent intent = new Intent(admin.this, editBerita.class);
        startActivity(intent);
    }

    public void controlUser(View view) {
        Intent intent = new Intent(admin.this, controlUser.class);
        startActivity(intent);
    }

    public void cekMasukan(View view) {
        Intent intent = new Intent(admin.this, cekMasukan.class);
        startActivity(intent);
    }
}