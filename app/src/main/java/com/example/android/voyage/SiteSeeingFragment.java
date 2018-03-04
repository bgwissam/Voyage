package com.example.android.voyage;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;



public class SiteSeeingFragment extends Fragment {
    private MediaPlayer playSound;
    private AudioManager mAudioManager;


    public SiteSeeingFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //numbers array
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //create audiomanager to request audiofocus
        mAudioManager = (AudioManager)
                getActivity().getSystemService(Context.AUDIO_SERVICE);
        //list of tours
        tours.add(new Tour("Jeita Grotto", "Beirut - Kesrwan", R.drawable.jeita_grotto_sight));
        tours.add(new Tour("National Musem", "Beirut - Furn Al Shebak", R.drawable.national_museum_sight));
        tours.add(new Tour("Martyrs' Sqaure", "Beirut - Riyad Al Solh", R.drawable.martyrs_square_sight));
        tours.add(new Tour("Sursock Museum", "Beirut - Ashrafieh", R.drawable.sursock_museum_sight));
        tours.add(new Tour("Lebanon by Kite", "Byblos - Jounieh", R.drawable.lebanon_by_kite_sight));
        tours.add(new Tour("Saint George Cathedral Church", "Beirut", R.drawable.saint_george_sight ));
        tours.add(new Tour("Baalbek Roman Ruins", "Baalbek", R.drawable.baalbeck_roman_ruin_sight));
        tours.add(new Tour("Umayyad City Runis", "Anjar", R.drawable.umayyad_city_ruins_sight));
        tours.add(new Tour("Kamouh Al Hermel", "Hermel", R.drawable.kamouh_el_hermel_sight));
        tours.add(new Tour("Temple of Echmun", "Sidon", R.drawable.temple_of_echmun_sight));
        tours.add(new Tour("Runis of Tyre", "Tyre", R.drawable.ruins_of_tyre_sight));
        tours.add(new Tour("Stone of The pregnant Woman", "Baalbek", R.drawable.stone_of_pregnant_sight));

        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.category_siteseeing);

        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Tour currentPosition = tours.get(position);

            }
        });

        return rootView;
    }

}

