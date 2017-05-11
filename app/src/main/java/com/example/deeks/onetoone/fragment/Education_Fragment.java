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

import static com.example.deeks.onetoone.R.drawable.education;

/**
 * Created by Deeks on 5/2/2017.
 */

public class Education_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> educations = new ArrayList<>();
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

        educations.add("बी.ई., एमई, डिप्लोमा, प्रोजेक्ट्स");
       // educations.add("क्लास");
        educations.add("महाविद्यालये");
        educations.add("संगणक वर्ग");
       // educations.add("नृत्य आणि अभिनय क्लास ");
        //educations.add("ड्रायव्हिंग स्कूल");
//        educations.add("अभियांत्रिकी क्लास");
//        educations.add("हायस्कूल");
        //educations.add("भाषा क्लास");
       // educations.add("ग्रंथालये");
       // educations.add("प्री प्राइमरी स्कूल");
       // educations.add("प्राइमरी स्कूल");
       // educations.add("खाजगी शिक्षण");
       // educations.add("टेलरिंग क्लास");
      //  educations.add("प्रशिक्षण संस्था");
        educations.add("सर्व पहा");


        listView = (ListView) view.findViewById(R.id.listViewAll);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list,educations);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
