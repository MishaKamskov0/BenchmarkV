package com.example.benchmarkv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.benchmarkv.adapters.ViewPagerAdapter;
import com.example.benchmarkv.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.mainViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(), getResources().getStringArray(R.array.name_tabs)));
        bind.mainTabLayout.setupWithViewPager(bind.mainViewPager);
    }

}