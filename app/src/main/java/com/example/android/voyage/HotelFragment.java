package com.example.android.voyage;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelFragment extends Fragment {

    public HotelFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //numbers array
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //list of tours
        tours.add(new Tour(R.string.crown_plaza, R.string.beirut_hamra, R.drawable.crown_plaza_hot));
        tours.add(new Tour(R.string.la_bristol, R.string.beirut_madame_curie, R.drawable.le_bristol_hot));
        tours.add(new Tour(R.string.phoenicia, R.string.beirut_ain_mraysawh, R.drawable.phoenicia_hot));
        tours.add(new Tour(R.string.chtaura_park, R.string.chtaura, R.drawable.chtaura_park_hot));
        tours.add(new Tour(R.string.la_commodore, R.string.beirut_hamra, R.drawable.le_commodore_hot));
        tours.add(new Tour(R.string.lancaster_tamar, R.string.beirut_emile_lahoud, R.drawable.lancaster_hot));
        tours.add(new Tour(R.string.the_grand_mashmosh, R.string.beirut_mar_nicolas, R.drawable.the_grand_meshmosh_hot));
        tours.add(new Tour(R.string.radisson_blu_martinez, R.string.beirut_ain_mraysawh, R.drawable.radisson_blue_martinez_hot));
        tours.add(new Tour(R.string.hilton_habtoor_grand, R.string.beirut_sin_el_fil, R.drawable.hilton_habtoor_grand_hot));
        tours.add(new Tour(R.string.monroe, R.string.beirut_ain_mraysawh, R.drawable.monroe_hot));

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

