package com.example.teiyuueki.tablayout3.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.teiyuueki.tablayout3.R;

/**
 * Created by teiyuueki on 2016/04/20.
 */
public class KittenViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;

    public KittenViewHolder(View itemView) {
        super(itemView);
        image = (ImageView) itemView.findViewById(R.id.image);
    }
}
