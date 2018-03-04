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



public class HotelFragment extends Fragment {
    private MediaPlayer playSound;
    private AudioManager mAudioManager;


    public HotelFragment() {
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
        tours.add(new Tour("Crown Plaza", "Beirut - Hamra", R.drawable.crown_plaza_hot));
        tours.add(new Tour("La Bristol", "Beirut - Madam Curie", R.drawable.le_bristol_hot));
        tours.add(new Tour("Phoenicia", "Beirut - Ain Le Mraysawh", R.drawable.phoenicia_hot));
        tours.add(new Tour("Chtaura Park", "Chtaura", R.drawable.chtaura_park_hot));
        tours.add(new Tour("Le Commodore", "Beirut - Hamra", R.drawable.le_commodore_hot));
        tours.add(new Tour("Lancaster Tamar", "Beirut - Blvr Emile Lahoud", R.drawable.lancaster_hot));
        tours.add(new Tour("The Grand Meshmosh", "Beirut - Mar Nicolas", R.drawable.the_grand_meshmosh_hot));
        tours.add(new Tour("Radisson Blu Martinez", "Beirut - Ain El Mraysawh", R.drawable.radisson_blue_martinez_hot));
        tours.add(new Tour("Hilton Habtoor Grand", "Beirut - Sin El Fil", R.drawable.hilton_habtoor_grand_hot));
        tours.add(new Tour("Monroe", "Beirut - Ain El Mraysawh", R.drawable.monroe_hot));



        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.category_hotel);

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

