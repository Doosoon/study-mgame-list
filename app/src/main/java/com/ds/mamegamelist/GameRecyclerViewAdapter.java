package com.ds.mamegamelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by doosoon on 2017-11-26.
 */

public class GameRecyclerViewAdapter extends RecyclerView.Adapter<GameItemViewHolder> {

    @Override
    public GameItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        final LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new GameItemViewHolder(inflater, parent);
    }

    @Override
    public void onBindViewHolder(GameItemViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        return GameDataManager.getInstance().getCount();
    }
}
