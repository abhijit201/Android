package com.example.deeks.onetoone.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.deeks.onetoone.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fashion_and_Lifestyle_Fragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<String> FashionNLifestyle = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;


    public Fashion_and_Lifestyle_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fashion_and__lifestyle_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       // FashionNLifestyle.add("बुटिक");
        FashionNLifestyle.add("कपड्यांचे दुकान");
        FashionNLifestyle.add("सौंदर्यप्रसाधन");
      //  FashionNLifestyle.add("कुशन वर्क्स");
//        FashionNLifestyle.add("फॅशन डिझायनर");
//        FashionNLifestyle.add("फुटवेअरचे दुकान");
//        FashionNLifestyle.add("ज्वेलरी");
       // FashionNLifestyle.add("खादी भंडार");
        //FashionNLifestyle.add("ऑप्टिक्स ");
        FashionNLifestyle.add("टेलर");
       // FashionNLifestyle.add("टॅट्टोस");
        //FashionNLifestyle.add("घड्याळ दुकाने");
        FashionNLifestyle.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listView4);
        adapter = new ArrayAdapter(getActivity(),R.layout.services_list, FashionNLifestyle);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
