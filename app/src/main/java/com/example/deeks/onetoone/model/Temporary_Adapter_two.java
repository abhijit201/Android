package com.example.deeks.onetoone.model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.deeks.onetoone.R;

import java.util.List;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Temporary_Adapter_two extends RecyclerView.Adapter<Temporary_Adapter_two.MyViewHolder>  {
    private List<Temporary_Adapter> temporary_adapters;

    public Temporary_Adapter_two(List<Temporary_Adapter> temporary_adapters){
        this.temporary_adapters = temporary_adapters;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_textview,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Temporary_Adapter temporary_adapter = temporary_adapters.get(position);
        holder.ServiceName.setText(temporary_adapter.getServiceName());
    }

    @Override
    public int getItemCount() {
        return temporary_adapters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView ServiceName;

        public MyViewHolder(View itemView) {
            super(itemView);
            ServiceName = (TextView) itemView.findViewById(R.id.textView17);

        }
    }
}
