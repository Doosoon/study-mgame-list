package com.ds.mamegamelist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by doosoon on 2017-11-26.
 */

public class GameItemViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageTitle;
    private ImageView mImageContent;
    private TextView mTitle;
    GameItemViewHolder(View itemView) {
        super(itemView);
        mImageTitle = itemView.findViewById(R.id.item_image_title);
        mImageContent = itemView.findViewById(R.id.item_image_content);
        mTitle = itemView.findViewById(R.id.item_title);
    }
    void setTitle(String title) {
        mTitle.setText(title);
    }
    void setImageTitle(int resId) {
        mImageTitle.setImageResource(resId);
    }
    void setImageContent(int resId) {
        mImageContent.setImageResource(resId);
    }
}
