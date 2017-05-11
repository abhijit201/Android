package com.example.deeks.onetoone.fragment.main_fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.deeks.onetoone.R;
import com.example.deeks.onetoone.activity.MainActivity;
import com.example.deeks.onetoone.fragment.contacts_fragments.Ambulance_Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListofServices extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> Emergency = new ArrayList<>();

    ListView listView;
    ArrayAdapter<String>adapter;


    public ListofServices() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity())
                .setActionBarTitle("Emergency");
        return inflater.inflate(R.layout.list_view_fragment, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

      //  Emergency.add("अपघात मित्र");
        Emergency.add("रुग्णवाहिका");
        Emergency.add("रक्तपेढी ");
        Emergency.add("फायर ब्रिगेड");
        //Emergency.add("पोलिस");
       // Emergency.add("साप पकडणारे  ");
        //Emergency.add("महिला  हेल्पलाईन नंबर");
        Emergency.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list,Emergency);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        FragmentManager fragmentManager;
        switch (i){
            case 0 :
                Ambulance_Fragment ambulance_fragment = new Ambulance_Fragment();
                //Services_Fragment services_fragment = new Services_Fragment();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,ambulance_fragment).addToBackStack("")
                        .commit();

                break;

        }

    }
}
