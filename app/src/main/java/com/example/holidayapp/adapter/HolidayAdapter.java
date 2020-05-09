package com.example.holidayapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.holidayapp.R;
import com.example.holidayapp.model.HolidaysItem;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.ViewHolder> {
    private ArrayList<HolidaysItem> holidaysItems = new ArrayList<>();
    private Context context;

    public HolidayAdapter(Context context) {
        this.context = context;
    }


    public void setData(ArrayList<HolidaysItem>items){
        holidaysItems.clear();
        holidaysItems.addAll(items);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HolidayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolidayAdapter.ViewHolder holder, int position) {
        holder.tgl.setText(holidaysItems.get(position).getDate());
        holder.hari.setText(holidaysItems.get(position).getName());
        holder.tgl3.setText(holidaysItems.get(position).getCountry());
        holder.tgl2.setText(holidaysItems.get(position).getCountry());

    }

    @Override
    public int getItemCount() {
        return holidaysItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView hari,tgl,tgl2,tgl3;
        CardView cvItem;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cvItem= itemView.findViewById(R.id.itemday);
            hari = itemView.findViewById(R.id.hari);
            tgl = itemView.findViewById(R.id.tgl);
            tgl3   = itemView.findViewById(R.id.tgl3);
            tgl2   = itemView.findViewById(R.id.tgl2);
        }
    }

}
