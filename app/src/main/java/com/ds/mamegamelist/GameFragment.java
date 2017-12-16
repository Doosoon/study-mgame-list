package com.ds.mamegamelist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by doosoon on 2017-11-25.
 */

public class GameFragment extends Fragment {

    private EditText mTitleField;
    private RecyclerView mGameRecyclerView;
    private GameRecyclerViewAdapter mAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_game, container, false);
        mTitleField = (EditText)v.findViewById(R.id.game_searh_title);
        mGameRecyclerView = (RecyclerView) v.findViewById(R.id.game_recycler_view);
        mGameRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new GameRecyclerViewAdapter();
        mGameRecyclerView.setAdapter(mAdapter);
        return v;
    }
}
