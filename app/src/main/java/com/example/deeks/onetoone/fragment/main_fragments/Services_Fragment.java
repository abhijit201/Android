package com.example.deeks.onetoone.fragment.main_fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.deeks.onetoone.R;


import java.util.ArrayList;



/**
 * A simple {@link Fragment} subclass.
 */
public class Services_Fragment extends Fragment {
    ArrayList<String> Service = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;


    public Services_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_services_, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Service.add("सुतार");
        Service.add("इलेक्ट्रीशियन");
        Service.add("जनरेटर");
       // Service.add("चावी बनवणारा ");
        Service.add("चित्रकार");
       // Service.add("कीटक नियंत्रण");
        //Service.add("प्लंबर");
       // Service.add("स्क्रॅप शॉप");
        //Service.add("टाकी स्वच्छता");
        Service.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listView3);
        adapter = new ArrayAdapter(getActivity(),R.layout.services_list, Service);
        listView.setAdapter(adapter);
        listView.deferNotifyDataSetChanged();

    }
}
