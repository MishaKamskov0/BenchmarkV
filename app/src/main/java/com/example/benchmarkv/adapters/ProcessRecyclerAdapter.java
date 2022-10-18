package com.example.benchmarkv.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.benchmarkv.R;
import com.example.benchmarkv.databinding.ItemProcessBinding;

import java.util.List;

public class ProcessRecyclerAdapter extends RecyclerView.Adapter<ProcessRecyclerAdapter.ViewHolder> {

    List<ProcessItem> list;

    public ProcessRecyclerAdapter(List<ProcessItem> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ProcessRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_process, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProcessRecyclerAdapter.ViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView hNameProcess;
        private final ProgressBar hIndicator;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            hNameProcess = itemView.findViewById(R.id.tvNameProcess);
            hIndicator = itemView.findViewById(R.id.progress_indicator);
        }

        public void bind(ProcessItem item){
            hNameProcess.setText(item.getNameOfProcess());
        }
    }
}
