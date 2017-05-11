package com.example.deeks.onetoone.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deeks.onetoone.R;

import java.util.Arrays;

/**
 * Created by Deeks on 4/15/2017.
 */

public class HomeGridAdapter extends BaseAdapter {
    Context context;

    public HomeGridAdapter(Context context) {
        this.context = context;
    }

    int[] Image = {
            R.drawable.foodndrink,
            R.drawable.emerggg,
            R.drawable.ayur,
            R.drawable.agencygas,
            R.drawable.earthmoves,
            R.drawable.government,
            R.drawable.housekeep,
            R.drawable.clinicsss,
            R.drawable.shopjpeg,
            R.drawable.dailyneeds,
            R.drawable.jobs,
            R.drawable.water,
            R.drawable.patrol,
            R.drawable.furnitureone,
            R.drawable.fittt,
            R.drawable.fas,
            R.drawable.tt,
            R.drawable.devotional,
            R.drawable.liquor,
            R.drawable.entre,
            R.drawable.media,
            R.drawable.banquet,
            R.drawable.political,
            R.drawable.real,
            R.drawable.hospii,
            R.drawable.kids,
            R.drawable.medical,
            R.drawable.education,
            R.drawable.agriculture,
            R.drawable.cc,
            R.drawable.social,
            R.drawable.consultant,
            R.drawable.services,
            R.drawable.beauty,
            R.drawable.hotels

    };
    String[] Services = {
            "अन्न आणि पेय",
            "आणीबाणी",
            "आयुर्वेदिक",
            "एजन्सी",
            "खोदकाम",
            "गव्हरेन्मेंट सेवा",
            "घराची देखभाल",
            "चिकित्सालय",
            "दुकाने",
            "दैनंदिन गरजा",
            "नोकरी",
            "पाणी",
            "पेट्रोल",
            "फर्निचरचे दुकान",
            "फिटनेस",
            "फॅशन",
            "फेरफटका आणि प्रवास",
            "भक्तीत्मक",
            "मद्य",
            "मनोरंजन",
            "मीडिया",
            "मेजवानी हॉल",
            "राजकीय पक्ष",
            "रिअल इस्टेट",
            "रूग्णालय",
            "लहान मुले",
            "वैद्यकीय सेवा",
            "शिक्षण",
            "शेती",
            "संगणक सेवा",
            "समाज सेवा",
            "सल्लागार",
            "सेवा",
            "सौंदर्य काळजी",
            "हॉटेल"

    };


    @Override
    public int getCount() {
        return Services.length;
    }

    @Override
    public Object getItem(int i) {
        return Services[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View grid;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
      //  if (view==null) {
            grid = new View(context);
            grid = inflater.inflate(R.layout.grid_item, null);

            ImageView imageView = (ImageView) grid.findViewById(R.id.ImgView);
            TextView textView = (TextView) grid.findViewById(R.id.textView);

            Arrays.sort(Services);
            imageView.setImageResource(Image[i]);
            textView.setText(Services[i]);
     //   }
//        }else {
//            grid = (View) view;
//        }
        return grid;
    }
}
