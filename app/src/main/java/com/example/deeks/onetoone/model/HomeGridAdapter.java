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

            R.drawable.emerg,
            R.drawable.foodndrink,
            R.drawable.ayurvedic,
           // R.drawable.agencygas,
            R.drawable.consult,
            R.drawable.agricultureee,
            R.drawable.earthmoves,
            R.drawable.governmentoffices,
            R.drawable.housekeep,
            R.drawable.clinicsss,
            R.drawable.hospital,
            R.drawable.shops,
            R.drawable.dailyneeds,
            R.drawable.jobs,
            R.drawable.patrol,
            R.drawable.showroom,
            R.drawable.fittt,
            R.drawable.fashion,
            R.drawable.tourntravel,
            R.drawable.devotional,
           // R.drawable.liquor,
            R.drawable.entre,
            R.drawable.media,
            R.drawable.banquet,
            R.drawable.vote,
            R.drawable.realestate,
            R.drawable.kids,
            R.drawable.medical,
            R.drawable.water,
            R.drawable.education,
            R.drawable.computernit,
            R.drawable.socialservice,
            R.drawable.services,
            R.drawable.beauty,
            R.drawable.hotelsnrestro
//            R.drawable.weeklymarket,
//            R.drawable.industrial
//            R.drawable.park,
//            R.drawable.devdarshan,
//            R.drawable.picnicspot,
//            R.drawable.bank
          //  R.drawable.bhagyavedh,
//            R.drawable.mobileservice,
//            R.drawable.smallbusiness,
//            R.drawable.brideorgroome,
//            R.drawable.workshop,
//            R.drawable.socialmedia,
//            R.drawable.stampvendor,
//            R.drawable.printingpress

    };
    String[] Services = {

            "अन्न आणि पेय",
            "अत्यावशक सेवा",
            "आयुर्वेदिक",
           // "एजन्सी",
            "खोदकाम",
            "गव्हरेन्मेंट सेवा",
            "घराची देखभाल",
            "चिकित्सालय",
            "दुकाने",
            "दैनदिन",
            "नोकरी",
            "वॉटर फील्टर",
            "पेट्रोल",
            "सजावट",
            "फिटनेस",
            "फॅशन",
            "फेरफटका आणि प्रवास",
            "भक्तीत्मक",
           // "मद्य",
            "मनोरंजन",
            "मिडिया",
            "मेजवानी",
            "राजकारण",
            "रिअल इस्टेट",
            "दवाखाना",
            "लहान मुले",
            "वैद्यकीय सेवा",
            "शिक्षण",
            "कृषी सेवा",
            "संगणक सेवा",
            "समाज सेवा",
            "कन्सलटंन्ट",
            "सर्विसेस",
            "सौंदर्य",
            "हॉटेल"
//            "आठवडे बाझार",
//            "इंड़स्ट्रीअल"
//            "उद्यान",
//            "देव दर्शन",
//            "पर्यटनस्थळे",
//            "बँक"
////            "भाग्यवेध",
////            "मोबाईल सर्विसेस",
////            "लघु उद्योग",
////            "वधु वर सूचक",
////            "वर्क शॉप",
////            "सोसीअल मेडिया ",
////            "स्टॉम्प वेन्डर",
////            "प्रिंटींग प्रेस"
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
            //imageView.setImageResource(Image[i]);

            textView.setText(Services[i]);
     //   }
//        }else {
//            grid = (View) view;
//        }
        return grid;
    }
}
