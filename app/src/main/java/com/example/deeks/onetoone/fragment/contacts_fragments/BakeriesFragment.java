package com.example.deeks.onetoone.fragment.contacts_fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.deeks.onetoone.R;

//import busineess.karyotype.deeks.onetoone.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BakeriesFragment extends Fragment {

    ListView listView;

    public BakeriesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false);
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView) view.findViewById(R.id.listView_Contacts);
        BakeryAdapter bakeryAdapter = new BakeryAdapter(getContext());
        listView.setAdapter(bakeryAdapter);


    }



    class BakeryAdapter extends BaseAdapter {
        Context context;

        public BakeryAdapter(Context context) {
            this.context = context;
        }

        String[] imagesNames = {
                "Agi Personal Business", "RTI",
                "Givernment Decisions"

        };

        String[] imagesNames2 = {
                "Employment News English", "PMC Citizen Grievances",
                "PMC E-Tenders"
        };

        String[] imagesNames3 = {"PMC Property Tax & Water Bill",
                "Building Permission", "Birth & Death Certificate"};

        @Override
        public int getCount() {
            return imagesNames.length;
        }

        @Override
        public Object getItem(int position) {
            return imagesNames[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rootview = layoutInflater.inflate(R.layout.contact_list_item, null);

            TextView textView = (TextView) rootview.findViewById(R.id.txtName);
            textView.setText(imagesNames[position]);

            TextView textView1 = (TextView) rootview.findViewById(R.id.txtAddress);
            textView1.setText(imagesNames2[position]);

            TextView textView2 = (TextView) rootview.findViewById(R.id.txtNo);
            textView2.setText(imagesNames3[position]);

            return rootview;

        }
    }
}
