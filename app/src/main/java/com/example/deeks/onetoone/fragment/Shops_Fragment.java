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
public class Shops_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> shops = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String>adapter;

    public Shops_Fragment() {
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

        shops.add("स्टील शॉप");
        shops.add("बॅटरी आणि इन्व्हर्टर");
//        shops.add("विद्युत दुकान ");
//        shops.add("इलेक्ट्रॉनिक दुकान");
//        shops.add("हार्डवेअर दुकान");
//        shops.add("घरगुती उपकरणे");
//        shops.add("पेंट दुकान");
//        shops.add("स्पोर्ट्स दुकान");
//        shops.add("घड्याळ दुकान");
        shops.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listViewAll);
        listView.setOnItemClickListener(this);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list,shops);
        listView.setAdapter(adapter);
        listView.deferNotifyDataSetChanged();

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

}
