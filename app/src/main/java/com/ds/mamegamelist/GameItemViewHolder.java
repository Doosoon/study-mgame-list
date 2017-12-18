package com.ds.mamegamelist;

import android.content.Context;
import android.content.Intent;
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
    private Context mContext;
    private int mId;

    GameItemViewHolder(LayoutInflater inflater, ViewGroup parent) {
        super(inflater.inflate(R.layout.game_item, parent, false));
        mImageTitle = itemView.findViewById(R.id.item_image_title);
        mImageContent = itemView.findViewById(R.id.item_image_content);
        mTitle = itemView.findViewById(R.id.item_title);
        mNumber = itemView.findViewById(R.id.item_number);
        mContext = parent.getContext();

        itemView.setOnClickListener((view) -> {
            Intent intent = new Intent(mContext, DetailActivity.class);
            intent.putExtra("INDEX", mId);
            mContext.startActivity(intent);
        });

    }

    public void bindData(int id) {
        mId = id;
        GameDataManager.GameData data = GameDataManager.getInstance().getData(id);
        mTitle.setText(data.title);
        mNumber.setText(String.valueOf(data.number));
        mImageTitle.setImageResource(data.titleImageResId);
        mImageContent.setImageResource(data.contentImageResId);
    }
}
