package com.ds.mamegamelist;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
        setHasOptionsMenu(true);
        Log.d("Test", "onCreate of Fragment");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_game, container, false);
        mTitleField = (EditText)v.findViewById(R.id.game_searh_title);
        mGameRecyclerView = (RecyclerView) v.findViewById(R.id.game_recycler_view);
        mGameRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new GameRecyclerViewAdapter();
        mGameRecyclerView.setAdapter(mAdapter);

        AppCompatActivity activity = (AppCompatActivity)getActivity();
        activity.getSupportActionBar().setSubtitle(String.valueOf(GameDataManager.getInstance().getCount()));

        Log.d("Test", "onCreateView of Fragment");
        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Test", "onAttach of Fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Test", "onActivityCreated of Fragment");
    }
}
