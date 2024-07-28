package com.example.bacayuktubes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

//import com.example.bacayuktubes.databinding.ActivityMainBinding;

//import android.app.activity_berita;

public class berita extends AppCompatActivity {

//    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita);
    }
}
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        replaceFragment(new BeritaFragment());
//
//        binding.bottomNavigationView.setOnItemSelectedListener(item -> {
//
//            switch (item.getItemId()){
//
//                case R.id.navBerita:
//                    replaceFragment(new berita());
//                    break;
//                case R.id.navProfile:
//                    replaceFragment(new profil());
//                    break;
//                case R.id.navMasukan:
//                    replaceFragment(new masukkan());
//                    break;
//            }
//
//
//            return true;
//
//        });
//    }
//
//    private void replaceFragment(Fragment fragment){
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.frame_layout,fragment);
//        fragmentTransaction.commit();
//    }
