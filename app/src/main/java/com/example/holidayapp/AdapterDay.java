package com.example.holidayapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class AdapterDay extends RecyclerView.Adapter<AdapterDay.ListViewHolder> {

    private ArrayList<ModelDay> listDay;
    private OnItemClickCallback onItemClickCallback;

    public AdapterDay(ArrayList<ModelDay> list){ this.listDay = list;}

    public ArrayList<ModelDay> getListDay() { return  listDay;}

    public void setListDay(ArrayList<ModelDay> listDay){ this.listDay = listDay;}

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        ModelDay day = listDay.get(position);
        holder.tgl.setText(day.getTgl());
        holder.tgl2.setText(day.getTgl());
        holder.hari.setText(day.getHari());
    }

    @Override
    public int getItemCount() { return listDay.size();}


    public class ListViewHolder extends RecyclerView.ViewHolder{
        private TextView tgl, tgl2, hari;
        public ListViewHolder(View itemView){
            super(itemView);
            tgl = itemView.findViewById(R.id.tgl);
            tgl2 = itemView.findViewById(R.id.tgl2);
            hari = itemView.findViewById(R.id.hari);
        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(ModelDay day);
    }
}
