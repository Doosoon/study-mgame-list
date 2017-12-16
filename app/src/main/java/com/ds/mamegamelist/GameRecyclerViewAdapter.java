package com.ds.mamegamelist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by doosoon on 2017-11-26.
 */

public class GameRecyclerViewAdapter extends RecyclerView.Adapter<GameItemViewHolder> {

    private String mTitles[] = {"삼국지 다이너스티 워\n109", "천지를 먹다2\n95",
            "Final Fight\n99", "Captain Commando\n102", "캐딜락과 공룡\n93", "333", "111", "222", "333", "111", "222", "333", "111", "222", "333", "111", "222", "333", "111", "222", "333"};

    private int mImageTitleResIds[] = { R.drawable.dw_t, R.drawable.wf_t, R.drawable.ff_t, R.drawable.cc_t, R.drawable.cd_t };
    private int mImageContentResIds[] = { R.drawable.dw_c, R.drawable.wf_c, R.drawable.ff_c, R.drawable.cc_c, R.drawable.cd_c };
    @Override
    public GameItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.game_item, parent, false);
        return new GameItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GameItemViewHolder holder, int position) {
        holder.setTitle(mTitles[position]);
        holder.setImageTitle(mImageTitleResIds[position%5]);
        holder.setImageContent(mImageContentResIds[(position)%5]);
    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
