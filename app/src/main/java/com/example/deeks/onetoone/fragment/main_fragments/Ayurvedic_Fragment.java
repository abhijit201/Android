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
import com.example.deeks.onetoone.fragment.contacts_fragments.Ayurvedic_List_Fragment;

import java.util.ArrayList;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Ayurvedic_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> ayurvedic = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.list_view_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ayurvedic.add("आयुर्वेदिक");
       // ayurvedic.add("आयुर्वेदिक चिकित्सालय");
        //ayurvedic.add("पंचकर्म केंद्र");
        ayurvedic.add("पतंजली चिकित्सालय");
        ayurvedic.add("पतंजली स्टोअर");
        ayurvedic.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter(getActivity(),R.layout.services_list,ayurvedic);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();


    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        FragmentManager fragmentManager;
        switch (i){
            case 0 :

                Ayurvedic_List_Fragment ayurvedic_list_fragment = new Ayurvedic_List_Fragment();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,ayurvedic_list_fragment).addToBackStack("")
                        .commit();
                break;

        }



    }
}
