package com.example.deeks.onetoone.fragment.main_fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.deeks.onetoone.R;
import com.example.deeks.onetoone.model.HomeGridAdapter;

/**
 * Created by Deeks on 4/15/2017.
 */

public class homeFragment extends Fragment {

    GridView gridView;
    FragmentManager fragmentManager;






    public homeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homefragment,container,false);
        HomeGridAdapter homeGridAdapter = new HomeGridAdapter(getContext());
        gridView = (GridView) view.findViewById(R.id.gridView1);
        gridView.setAdapter(homeGridAdapter);
        gridView.deferNotifyDataSetChanged();

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {

                    case 0:
                        Food_And_Drinks_Fragment food_and_drinks_fragment = new Food_And_Drinks_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, food_and_drinks_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 1:
                        ListofServices listofServices=new ListofServices();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container,listofServices).addToBackStack("")
                                .commit();
                        break;

                    case 2:
                        Ayurvedic_Fragment ayurvedic_fragment = new Ayurvedic_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, ayurvedic_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 3:
                        Agency_Fragment  agency_fragment = new Agency_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, agency_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 4:
                        Earth_Movers_Fragment Earth_Movers_Fragment= new Earth_Movers_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Earth_Movers_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 5:
                        Goverenment_Offices_Fragment  goverenment_offices_fragment = new Goverenment_Offices_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, goverenment_offices_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 6:
                        Security_Housekeeping_Fragment Security_Housekeeping_Fragment= new Security_Housekeeping_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Security_Housekeeping_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 7:
                        Clinic_Fragment  clinic_fragment = new Clinic_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, clinic_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 8:
                        Shops_Fragment shops_fragment = new Shops_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, shops_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 9:
                        Daily_Needs_Fragment daily_needs_fragment = new Daily_Needs_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container,daily_needs_fragment).addToBackStack("")
                                .commit();

                        break;

                    case 10:
                        Jobs_Fragment jobs_fragment  = new Jobs_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, jobs_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 11:
                        Water_Fragment water_fragment = new Water_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, water_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 12:
                        Petroal_Fragment petroal_fragment   = new Petroal_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, petroal_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 13:
                        Home_Office_Fragment Home_Office_Fragment= new Home_Office_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Home_Office_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 14:
                        Fitness_Fragment  fitness_fragment = new Fitness_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, fitness_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 15:
                        Fashion_and_Lifestyle_Fragment fashion_and_lifestyle_fragment = new Fashion_and_Lifestyle_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container,fashion_and_lifestyle_fragment).addToBackStack("")
                                .commit();

                        break;

                    case 16:
                        Travel_Transport_Fragment travel_transport_fragment = new Travel_Transport_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, travel_transport_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 17:
                        Devotional_Fragment Devotional_Fragment = new Devotional_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Devotional_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 18:
                        Liquor_Fragment Liquor_Fragment= new Liquor_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Liquor_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 19:
                        Entertainment_Fragment Entertainment_Fragment= new Entertainment_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Entertainment_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 20:
                        Media_Fragment media_Fragment= new Media_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, media_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 21:
                        Banquet_Fragment  banquet_fragment = new Banquet_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, banquet_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 22:
                        Political_Party_Fragment Political_Party_Fragment= new Political_Party_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Political_Party_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 23:
                        Real_Estate_Fragment real_estate_fragment= new Real_Estate_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, real_estate_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 24:
                        Hospitals_Fragment hospitals_fragment = new Hospitals_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container,hospitals_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 25:
                        Kids_Fragment  Kids_Fragment= new Kids_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Kids_Fragment).addToBackStack("")
                                .commit();
                        break;


                    case 26:
                        Medical_Service_Fragment medical_service_fragment = new Medical_Service_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, medical_service_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 27:
                        Education_Fragment education_fragment = new Education_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, education_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 28:
                        Agriculture_Fragment agriculture_fragment = new Agriculture_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, agriculture_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 29:
                        Computer_It_Fragment computer_it_fragment = new Computer_It_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, computer_it_fragment).addToBackStack("")
                                .commit();
                        break;


                    case 30:
                        Social_Work_Fragment  Social_Work_Fragment = new Social_Work_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Social_Work_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 31:
                        Consultant_Fragment Consultant_Fragment= new Consultant_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Consultant_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 32:
                        Services_Fragment services_fragment = new Services_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container,services_fragment).addToBackStack("")
                                .commit();

                        break;

                    case 33:
                        BeautyCare_Fragment beautyCare_fragment = new BeautyCare_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, beautyCare_fragment).addToBackStack("")
                                .commit();
                        break;

                    case 34:
                        Hotels_Fragment Hotels_Fragment= new Hotels_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, Hotels_Fragment).addToBackStack("")
                                .commit();
                        break;

                    case 35:
                        Other_Fragment other_fragment   = new Other_Fragment();
                        fragmentManager = getActivity().getSupportFragmentManager();
                        fragmentManager.beginTransaction().replace(R.id.container, other_fragment).addToBackStack("")
                                .commit();
                        break;
//
//                    case 34:
//                        Workshops_Fragment workshops_fragment = new Workshops_Fragment();
//                        fragmentManager = getActivity().getSupportFragmentManager();
//                        fragmentManager.beginTransaction().replace(R.id.container, workshops_fragment).addToBackStack("")
//                                .commit();
//                        break;

//                    case 36:
//                        Dwelling_Residance_Fragment dwelling_residance_fragment  = new Dwelling_Residance_Fragment();
//                        fragmentManager = getActivity().getSupportFragmentManager();
//                        fragmentManager.beginTransaction().replace(R.id.container, dwelling_residance_fragment).addToBackStack("")
//                                .commit();
//                        break;
//




                }

            }
        });
        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
