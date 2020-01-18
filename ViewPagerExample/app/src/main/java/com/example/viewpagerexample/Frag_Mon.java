package com.example.viewpagerexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Frag_Mon extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.frag__mon, container, false);
    }
    public static Frag_Mon newInstance(){
        Frag_Mon frag_mon = new Frag_Mon();
        return frag_mon;
    }


}
