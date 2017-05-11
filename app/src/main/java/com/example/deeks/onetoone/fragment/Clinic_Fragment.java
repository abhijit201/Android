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
import com.example.deeks.onetoone.activity.MainActivity;

import java.util.ArrayList;

/**
 * Created by Deeks on 5/3/2017.
 */

public class Clinic_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> clinics = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((MainActivity) getActivity())
                .setActionBarTitle("Your jdgstitle");
        return inflater.inflate(R.layout.list_view_fragment,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        clinics.add("दंतचिकित्सक");
       // clinics.add("सौंदर्याचा क्लिनिक");
        clinics.add("नेत्र क्लिनिक");
        clinics.add("सामान्य चिकित्सक");
       // clinics.add("पशुवैद्यकीय");
       // clinics.add("त्वचा क्लिनिक");
        clinics.add("आयुर्वेदिक क्लिनिक");
       // clinics.add("कानांचे क्लिनिक");
       // clinics.add("बाल चिकित्सा केंद्र");
       // clinics.add("केस क्लिनिक");
       // clinics.add("होमिओपॅथीक क्लिनिक");
       // clinics.add("क्लिनिक");
        clinics.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter<String>(getContext(),R.layout.services_list,clinics);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
