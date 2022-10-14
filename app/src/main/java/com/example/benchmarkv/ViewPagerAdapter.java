package com.example.benchmarkv;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.benchmarkv.ui_fragments.CollectionFragment;
import com.example.benchmarkv.ui_fragments.MapFragment;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private String[] namesOfTabs = {"Collections", "Maps"};

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 1:
                return new MapFragment();
        }
        return new CollectionFragment();
    }



    @Override
    public int getCount() {
        return namesOfTabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return namesOfTabs[position];
    }
}
