package com.example.benchmarkv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.benchmarkv.R;

public class CollectionRecyclerAdapter extends RecyclerView.Adapter<CollectionRecyclerAdapter.ViewHolder> {

    ProcessCollection[] list;


    public CollectionRecyclerAdapter() {


    }

    public CollectionRecyclerAdapter(ProcessCollection[] list) {
        this.list = list;
    }

    @NonNull
    @Override
    public CollectionRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_process, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CollectionRecyclerAdapter.ViewHolder holder, int position) {
        holder.hNameProcess.setText("Adding\n" + "in the beginning ArrayList N/A ms");
        //holder.hNameProcess.setText(list[position].getNameOfProcess());
    }

    @Override
    public int getItemCount() {
        //return list.length;
        return 21;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView hNameProcess;
        ImageView hIndicator;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hNameProcess = itemView.findViewById(R.id.tvNameProcess);
            hIndicator = itemView.findViewById(R.id.imgIndicator);
        }
    }
}
