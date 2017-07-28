package com.androidedu.kodluyoruzakademi.activityfragmentlifecycle;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    final String TAG = "BurakEKMEN";

    public SecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG, "onCreateView - SecondFragment");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate - SecondFragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated - SecondFragment");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart - SecondFragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume - SecondFragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause - SecondFragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop - SecondFragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy - SecondFragment");
    }

}
