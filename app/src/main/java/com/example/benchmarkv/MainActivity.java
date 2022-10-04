package com.example.benchmarkv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout mainTabLayout;
    private ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createViewPager();
    }

    private void createViewPager(){
        mainViewPager = findViewById(R.id.mainViewPager);
        mainViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        mainTabLayout = findViewById(R.id.mainTabLayout);
        mainTabLayout.setupWithViewPager(mainViewPager);
    }
}