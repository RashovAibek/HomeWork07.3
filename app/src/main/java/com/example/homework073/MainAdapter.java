package com.example.homework073;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ArrayList<User> list;
    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_first_rv,parent,false);
        return new ViewHolder(view);
    }

    public void setList(ArrayList<User> list) {
        this.list = new ArrayList<>();
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView country , city;
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            country = itemView.findViewById(R.id.tv1);
            city = itemView.findViewById(R.id.tv2);
            imageView = itemView.findViewById(R.id.image1);
        }

        public void onBind(User user) {
            city.setText(user.getNameCity());
            country.setText(user.getNameCountry());
            imageView.setImageResource(user.getPhoto());
        }
    }
}
