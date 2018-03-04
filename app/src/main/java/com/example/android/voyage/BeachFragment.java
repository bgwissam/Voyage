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



public class BeachFragment extends Fragment {
    private MediaPlayer playSound;
    private AudioManager mAudioManager;
    public BeachFragment() {
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
        tours.add(new Tour("Iris Beach Club", "Mount Lebanon - Damour", R.drawable.iris_beach_club));
        tours.add(new Tour("White Beach", "Batroun - Thoum", R.drawable.white_beach));
        tours.add(new Tour("Pierre & Friends", "Byblos - Madfoun", R.drawable.pierre___friends_beach));
        tours.add(new Tour("C Flow Beach Resort", "Byblos", R.drawable.c_flow_beach_resort));
        tours.add(new Tour("Janna Sur Mer Beach", "Damour - Beit el dine Rd.", R.drawable.janna_sur_mer_beach));
        tours.add(new Tour("Eddesands Resort", "Byblos - Sea Side Rd.", R.drawable.eddesands_resort_beach));
        tours.add(new Tour("Lazy B Beach", "Jiye - Jiyeh Main St.", R.drawable.lazy_b_beach));
        tours.add(new Tour("O Glacee Beach", "Batroun - Sea Rd.", R.drawable.o_glacee_beach));
        tours.add(new Tour("Jonas Beach", "Jiye - Sea Side Rd.", R.drawable.jonas_beach));
        tours.add(new Tour("Warwick Pangea Beach", "Jiye - Sea Side Rd.", R.drawable.warwick_pangea_beach));


        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.category_beach);

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
