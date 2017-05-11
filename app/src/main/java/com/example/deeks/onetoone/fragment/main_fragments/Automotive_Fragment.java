package com.example.deeks.onetoone.fragment.main_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.deeks.onetoone.R;

import java.util.ArrayList;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Automotive_Fragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<String> automotive = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;

    public Automotive_Fragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.list_view_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        automotive.add("कार सजावट");
        automotive.add("कार वॉश आणि तपशील केंद्र");
        automotive.add("गॅरेज चार चाकी");
        //automotive.add("गॅरेज दुचाकी");
        //automotive.add("काचेच्या रबर आणि फिटिंगचे काम");
        //automotive.add("विक्री आणि सेवा केंद्र दुचाकी");
        //automotive.add("विक्री आणि सेवा केंद्र चार चाकी");
        //automotive.add("शोरुम चार चाकी");
        //automotive.add("शोरुम दुचाकी");
        automotive.add("टायर");
        automotive.add("सर्व पहा");
        listView= (ListView) view.findViewById(R.id.listViewAll);
        listView.setOnItemClickListener(this);
        listView.setAdapter(new ArrayAdapter<String>(getActivity(),R.layout.services_list,automotive));
        listView.deferNotifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getContext(), "item Clicked........", Toast.LENGTH_SHORT).show();

    }
}
