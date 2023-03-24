package com.clubproject.demandes.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DocumentAdapter extends RecyclerView.Adapter<DocumentAdapter.DocumentViewHolder> {
    @NonNull
    @Override
    public DocumentAdapter.DocumentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DocumentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class DocumentViewHolder extends RecyclerView.ViewHolder{

        public DocumentViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
