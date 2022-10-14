package com.example.benchmarkv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.benchmarkv.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());



        bind.mainViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        bind.mainTabLayout.setupWithViewPager(bind.mainViewPager);
    }

}