package com.ds.mamegamelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by doosoon on 2017-11-26.
 */

public class GameItemViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageTitle;
    private ImageView mImageContent;
    private TextView mTitle;
    private TextView mNumber;
    GameItemViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.game_item, parent, false));
        mImageTitle = itemView.findViewById(R.id.item_image_title);
        mImageContent = itemView.findViewById(R.id.item_image_content);
        mTitle = itemView.findViewById(R.id.item_title);
        mNumber = itemView.findViewById(R.id.item_number);

    }
    void setTitleNumber(String title, int number) {

        mTitle.setText(title);
        mNumber.setText(String.valueOf(number));
    }
    void setImageTitle(int resId) {
        mImageTitle.setImageResource(resId);
    }
    void setImageContent(int resId) {
        mImageContent.setImageResource(resId);
    }
}
