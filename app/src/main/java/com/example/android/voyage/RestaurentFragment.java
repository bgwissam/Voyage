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



public class RestaurentFragment extends Fragment {
    private MediaPlayer playSound;
    private AudioManager mAudioManager;


    public RestaurentFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);


        //numbers array
        final ArrayList<Tour> tours = new ArrayList<Tour>();


        //list of tours
        tours.add(new Tour("Mayring", "Beirut", R.drawable.mayring_rest));
        tours.add(new Tour("Liza", "Beirut", R.drawable.liza_rest));
        tours.add(new Tour("Enab", "Beirut", R.drawable.enab_rest));
        tours.add(new Tour("Batching", "Dbayeh", R.drawable.batching_rest));
        tours.add(new Tour("Cafe Em Nazih", "Beirut", R.drawable.cafe_em_nazih_rest));
        tours.add(new Tour("Mounir", "Broumana", R.drawable.mounir_rest));
        tours.add(new Tour("Couqley Frensh Bistro", "Beirut", R.drawable.couqley_branch_bistro_rest));
        tours.add(new Tour("Em Sherif", "Beirut", R.drawable.em_sherif_rest));
        tours.add(new Tour("Al Sultan Ibrahim", "Beirut", R.drawable.alsultan_ibrahim_rest));
        tours.add(new Tour("Al Falamanky", "Beirut", R.drawable.al_falamnky_rest));



        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.category_restaurent );

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

