package com.ds.mamegamelist;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Test", "onCreate before fragment");
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new GameListFragment();
            Log.d("Test", "onCreate fragment new");
            fm.beginTransaction().add(R.id.fragment_container, fragment)
                    .commit();
            Log.d("Test", "onCreate fragment committed");
        }
        Log.d("CP_TEST", "onCreate end");
    }
}
