package com.example.benchmarkv.ui_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.benchmarkv.R;
import com.example.benchmarkv.adapters.CollectionRecyclerAdapter;

import java.util.ArrayList;


public class MapFragment extends Fragment {

    private RecyclerView processRecyclerView;
    private CollectionRecyclerAdapter rvAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_map, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        processRecyclerView = view.findViewById(R.id.mapRecycler);
        processRecyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 3));

        rvAdapter = new CollectionRecyclerAdapter();
        processRecyclerView.setAdapter(rvAdapter);
    }





}
