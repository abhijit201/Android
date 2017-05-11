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
 * Created by Deeks on 5/3/2017.
 */

public class Consultant_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> consultamts=new ArrayList<>();
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

        consultamts.add("वकील");
        consultamts.add("चार्टर अकाउंटंट");
        consultamts.add("कंपनी सचिव");
//        consultamts.add("विमा");
//        consultamts.add("गुंतवणूक सल्लागार");
//        consultamts.add("नोकरी सल्लागार");
//        consultamts.add("पारपत्र व्हिसा परदेशी दौरा");
//        consultamts.add("कर सल्लागार");
        consultamts.add("सर्व पहा");
        listView= (ListView) view.findViewById(R.id.listViewAll);
        adapter=new ArrayAdapter<String>(getContext(),R.layout.services_list,consultamts);
        listView.setAdapter(adapter);
        listView.deferNotifyDataSetChanged();
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
