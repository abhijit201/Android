package com.example.deeks.onetoone.fragment;


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
import android.widget.Switch;

import com.example.deeks.onetoone.R;
import com.example.deeks.onetoone.activity.MainActivity;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Food_And_Drinks_Fragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<String> FoodAndDrinks = new ArrayList<>();
    ListView listView;
    ArrayAdapter<String> adapter;


    public Food_And_Drinks_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((MainActivity) getActivity())
                .setActionBarTitle("Yourdikkkkha title");
        return inflater.inflate(R.layout.fragment_food__and__drinks_, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FoodAndDrinks.add("बेकरी");
        //FoodAndDrinks.add("भेळ दुकाने ");
       // FoodAndDrinks.add("बिर्याणी दुकाने ");
          FoodAndDrinks.add("कॅफे ");
//        FoodAndDrinks.add("चिनी ");
          FoodAndDrinks.add("आइस्क्रीम पार्लर");
//        FoodAndDrinks.add("रस केंद्र");
//        FoodAndDrinks.add("खानावळ ");
//        FoodAndDrinks.add("फास्ट फूड");
//        FoodAndDrinks.add("मासे आहार");
//        FoodAndDrinks.add("खाद्यपदार्थ");
//        FoodAndDrinks.add("दक्षिण भारतीय अन्न ");
//        FoodAndDrinks.add("स्वीटमार्ट");
//        FoodAndDrinks.add("चहाचे दुकान");
        FoodAndDrinks.add("सर्व पहा");

        listView = (ListView) view.findViewById(R.id.listView5);
        adapter = new ArrayAdapter<String>(getActivity(),R.layout.services_list, FoodAndDrinks);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        listView.deferNotifyDataSetChanged();

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
        getActivity().setTitle("");
        FragmentManager fragmentManager;
        switch(i){
            case 0 :
             BakeriesFragment bakeriesFragment = new BakeriesFragment();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,bakeriesFragment).addToBackStack("")
                    .commit();
            break;

            case 1:
                Cafe_Fragment cafe_fragment = new Cafe_Fragment();
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.container,cafe_fragment).addToBackStack("")
                        .commit();
                break;


        }


    }
}
