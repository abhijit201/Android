package com.example.deeks.onetoone.fragment;


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
public class Daily_Needs_Fragment extends Fragment {
    ArrayList<String> DailyNeeds = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String>adapter;


    public Daily_Needs_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daily__needs_, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        DailyNeeds.add("चिकन ची दुकाने");
        DailyNeeds.add("दैनंदिन गरजा");
       // DailyNeeds.add("कपडे धुऊन मिळण्याचे ठिकाण");
       // DailyNeeds.add("ड्राय फळे");
        DailyNeeds.add("मासे दुकान");
       // DailyNeeds.add("फ्लोर मिल्स");
       // DailyNeeds.add("फुले");
        //DailyNeeds.add("फळे आणि भाज्या");
        //DailyNeeds.add("भेटवस्तूंचा दुकान");
       // DailyNeeds.add("किराणा दुकान");
       // DailyNeeds.add("घरपोच सेवा");
       // DailyNeeds.add("फोटो स्टुडिओ");
        //DailyNeeds.add("सुपर मार्केट");
        DailyNeeds.add("सर्व पहा");



        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.services_list, DailyNeeds);
        listView.setAdapter(adapter);
        listView.deferNotifyDataSetChanged();
    }

}
