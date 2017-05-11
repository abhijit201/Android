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
public class Hotels_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> hotels = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;

    public Hotels_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_view_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        hotels.add("शाकाहारी हॉटेल्स");
        hotels.add("गैर शाकाहारी हॉटेल्स");
        hotels.add("गैर शाकाहारी/शाकाहारी हॉटेल्स ");
        hotels.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        listView.setOnItemClickListener(this);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list,hotels);
        listView.setAdapter(adapter);
        listView.deferNotifyDataSetChanged();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

}
