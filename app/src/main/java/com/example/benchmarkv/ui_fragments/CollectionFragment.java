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
import com.example.benchmarkv.adapters.ProcessItem;
import com.example.benchmarkv.adapters.ProcessRecyclerAdapter;

import java.util.ArrayList;
import java.util.List;


public class CollectionFragment extends Fragment {


    private ProcessRecyclerAdapter rvAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_process_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RecyclerView processRecyclerView = view.findViewById(R.id.processItemsRecycler);
        processRecyclerView.setLayoutManager(new GridLayoutManager(this.getContext(), 3));

        rvAdapter = new ProcessRecyclerAdapter(fillRecyclerView());
        processRecyclerView.setAdapter(rvAdapter);
    }



    private List<ProcessItem> fillRecyclerView(){

        List<ProcessItem> data = new ArrayList<>();
        String[] operations = getResources().getStringArray(R.array.operations);

        for (int i = 0; i < operations.length; i++) {
            data.add(new ProcessItem( operations[i] + getString(R.string.str_array_ms)));
            data.add(new ProcessItem( operations[i] + getString(R.string.str_linked_ms)));
            data.add(new ProcessItem( operations[i] + getString(R.string.str_cow_ms)));
        }

        return data;
    }


}