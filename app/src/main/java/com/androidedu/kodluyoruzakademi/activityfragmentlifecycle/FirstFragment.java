package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FirstFragment extends Fragment {

    final String TAG = "BurakEKMEN";

    public FirstFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView - FirstFragment");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate - FirstFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated - FirstFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart - FirstFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume - FirstFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause - FirstFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop - FirstFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy - FirstFragment");
    }


}
