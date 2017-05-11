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

import com.example.deeks.onetoone.R;
import com.example.deeks.onetoone.activity.MainActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Hospitals_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> Hospitals = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;



    public Hospitals_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((MainActivity) getActivity())
                .setActionBarTitle("Your title");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.list_view_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Hospitals.add("अपघात रुग्णालये");
        Hospitals.add("हृदयाची रुग्णालये");
        Hospitals.add("प्रसूती रुग्णालये");
       // Hospitals.add("बहुउद्देशीय रुग्णालये");
       // Hospitals.add("ऑर्थोपेडिक रुग्णालय");
       // Hospitals.add("मुलांची रुग्णालये");
//        Hospitals.add("दंत रुग्णालये");
//        Hospitals.add("कान नाक घसा रुग्णालये");
       // Hospitals.add("नेत्र रुग्णालये");
        //Hospitals.add("सरकारी रुग्णालये");
       // Hospitals.add("फिजिओथेरपी हॉस्पिटल");
        Hospitals.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list, Hospitals);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
