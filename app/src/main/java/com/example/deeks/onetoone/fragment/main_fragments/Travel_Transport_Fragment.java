package com.example.deeks.onetoone.fragment.main_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.deeks.onetoone.R;
import com.example.deeks.onetoone.model.Temporary_Adapter;
import com.example.deeks.onetoone.model.Temporary_Adapter_two;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Travel_Transport_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> travelnTransports = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;

    //Related to recyclerView
   /* List<Temporary_Adapter> automotive = new ArrayList<>();
     RecyclerView recyclerView;
    private Temporary_Adapter_two adapterTwo;
*/



       public Travel_Transport_Fragment() {
          }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.list_view_fragment,container,false);
        }

        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            travelnTransports.add("कुरिअर");
            travelnTransports.add("लोकल ट्रान्सपोर्ट");
//            travelnTransports.add("रिक्शा");
//            travelnTransports.add("टेंपो");
//            travelnTransports.add("तिकीट बुकिंग");
//            travelnTransports.add("टूर्स आणि ट्रॅव्हल्स");
            travelnTransports.add("सर्व पहा");

            listView = (ListView) view.findViewById(R.id.listViewAll);
            adapter = new ArrayAdapter<String>(getContext(),R.layout.services_list,travelnTransports);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(this);
            listView.deferNotifyDataSetChanged();


        }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

       /*
        public void recyclerviewRelated(View view){
            automotive.add(new Temporary_Adapter("कार सजावट"));
            automotive.add(new Temporary_Adapter("कार वॉश आणि तपशील केंद्र"));
            automotive.add(new Temporary_Adapter("गॅरेज चार चाकी"));
            automotive.add(new Temporary_Adapter("गॅरेज दुचाकी"));
            automotive.add(new Temporary_Adapter("काचेच्या रबर आणि फिटिंगचे काम"));
            automotive.add(new Temporary_Adapter("विक्री आणि सेवा केंद्र दुचाकी"));
            automotive.add(new Temporary_Adapter("विक्री आणि सेवा केंद्र चार चाकी"));
            automotive.add(new Temporary_Adapter("शोरुम चार चाकी"));
            automotive.add(new Temporary_Adapter("शोरुम दुचाकी"));
            automotive.add(new Temporary_Adapter("टायर"));
            automotive.add(new Temporary_Adapter("सर्व पहा"));

            recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewItem);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
            recyclerView.setLayoutManager(mLayoutManager);
            adapterTwo = new Temporary_Adapter_two(automotive);
            recyclerView.setAdapter(adapterTwo);

        }*/
    }
