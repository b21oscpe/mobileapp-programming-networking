package com.example.networking;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MountainViewHolder>  {
    private ArrayList<Mountain> mountains;

    public RecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MountainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.mountain_item, parent, false);
        return new MountainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.MountainViewHolder holder, int position) {
        String mountain = mountains.get(position).getName();
        String location = mountains.get(position).getLocation();
        Integer height = mountains.get(position).getHeight();
        holder.mountain.setText(mountain);
        holder.location.setText((location));
        holder.height.setText(height.toString());
        holder.wiki.setText(mountains.get(position).getAuxdata().getWiki());

    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }

    public class MountainViewHolder extends RecyclerView.ViewHolder {

        private TextView mountain, location, height, wiki;

        public MountainViewHolder(final View itemView) {
            super(itemView);
            mountain = itemView.findViewById(R.id.mountain);
            location = itemView.findViewById(R.id.location);
            height = itemView.findViewById(R.id.height);
            wiki = itemView.findViewById(R.id.wiki);
        }

    }
}