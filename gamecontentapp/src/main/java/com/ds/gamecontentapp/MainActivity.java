package com.ds.gamecontentapp;

import android.content.ContentValues;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("CP_TEST","onCreate");
        Button button = (Button)findViewById(R.id.game_cp);
        button.setOnClickListener((v)-> {
            ContentValues cv = new ContentValues();
            try {
                getContentResolver().update(
                        Uri.parse("content://com.ds.mamegamelist.gamecontentprovider/test"),
                        cv, null, null);
            } catch (SecurityException e) {
                Log.d("CP_TEST", e.toString());
            }

        });
    }
}
