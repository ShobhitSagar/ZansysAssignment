package com.robillo.zansysassignment;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by robinkamboj on 05/09/17.
 */

public class VHRecycler extends RecyclerView.ViewHolder{

    ImageView imageView;
    TextView textView;

    public VHRecycler(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_view);
        textView = itemView.findViewById(R.id.text_view);
    }
}
