package com.robillo.zansysassignment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by robinkamboj on 05/09/17.
 */

public class RVRecycler extends RecyclerView.Adapter<VHRecycler>{

    List<Data> data = new ArrayList<>();
    Context parentContext, context;

    public RVRecycler(List<Data> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public VHRecycler onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        parentContext = parent.getContext();
        return new VHRecycler(v);
    }

    @Override
    public void onBindViewHolder(VHRecycler holder, int position) {
//        Bitmap bmImg = BitmapFactory.decodeFile(data.get(position).getUrl());
//        holder.imageView.setImageBitmap(bmImg);
        Glide.with(parentContext).load(data.get(position).getUrl()).into(holder.imageView);
        if(!data.get(position).getCaption().equals("NO TEXT")){
            holder.textView.setText(data.get(position).caption);
        }
        else {
            holder.textView.setBackgroundColor(parentContext.getResources().getColor(R.color.transparent));
        }
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
