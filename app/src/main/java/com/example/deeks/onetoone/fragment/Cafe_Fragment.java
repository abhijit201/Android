package com.example.deeks.onetoone.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.deeks.onetoone.R;

//import busineess.karyotype.deeks.onetoone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Cafe_Fragment extends Fragment {


    public Cafe_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_, container, false);
    }

}
