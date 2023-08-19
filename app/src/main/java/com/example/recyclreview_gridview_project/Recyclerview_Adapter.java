package com.example.recyclreview_gridview_project;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Recyclerview_Adapter extends RecyclerView.Adapter<Recyclerview_Adapter.ViewHolder> {
    MainActivity mainActivity;
    String[] name;
    int[] img;
    String[] price;
    public Recyclerview_Adapter(MainActivity mainActivity, String[] name, int[] img, String[] price) {
        this.mainActivity=mainActivity;
        this.name=name;
        this.img=img;
        this.price=price;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.recyclerview_item_file,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Recyclerview_Adapter.ViewHolder holder, int position) {
        holder.name.setText(""+name[position]);
        holder.price.setText(""+price[position]);
        holder.img.setImageResource(img[position]);

    }



    @Override
    public int getItemCount() {
        return name.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name,price;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
            price=itemView.findViewById(R.id.price);
        }
    }
}
