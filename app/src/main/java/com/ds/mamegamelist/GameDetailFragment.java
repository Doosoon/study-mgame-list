package com.ds.mamegamelist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class GameDetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_GAME_ID = "game_id";

    private int mId;
    private TextView mIdTextView;
    private Button mPhotoButton;

    public GameDetailFragment() {
        // Required empty public constructor
    }

    public static GameDetailFragment newInstance(int id) {
        GameDetailFragment fragment = new GameDetailFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_GAME_ID, id);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mId = getArguments().getInt(ARG_GAME_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game_detail, container, false);
        mIdTextView = view.findViewById(R.id.game_id);

        mIdTextView.setText(String.valueOf(mId));
        mPhotoButton = view.findViewById(R.id.game_camera);
        mPhotoButton.setOnClickListener((v)-> {
            final Intent captureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(captureIntent);
        });

        return view;
    }

}
