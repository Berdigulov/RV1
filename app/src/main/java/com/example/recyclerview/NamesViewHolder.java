package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvUsers;

    public NamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvUsers = itemView.findViewById(R.id.tv_names);
    }

    public void bind(String name){
        tvUsers.setText(name);
    }
}
