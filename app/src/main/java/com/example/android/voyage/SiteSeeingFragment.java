package com.example.android.voyage;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SiteSeeingFragment extends Fragment {

    public SiteSeeingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //numbers array
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //list of tours
        tours.add(new Tour(R.string.jeita_grotto, R.string.beirut_kesrwan, R.drawable.jeita_grotto_sight));
        tours.add(new Tour(R.string.national_museum, R.string.beirut_furn_al_shebak, R.drawable.national_museum_sight));
        tours.add(new Tour(R.string.martyr_square, R.string.beirut_riyad_al_solh, R.drawable.martyrs_square_sight));
        tours.add(new Tour(R.string.sursock_museum, R.string.beirut_achrafieh, R.drawable.sursock_museum_sight));
        tours.add(new Tour(R.string.lebanon_by_kite, R.string.byblos_jounieh, R.drawable.lebanon_by_kite_sight));
        tours.add(new Tour(R.string.saint_goerge_church, R.string.beirut, R.drawable.saint_george_sight));
        tours.add(new Tour(R.string.baalbek_roman_runis, R.string.baalbek, R.drawable.baalbeck_roman_ruin_sight));
        tours.add(new Tour(R.string.umayyad_city_ruins, R.string.anjar, R.drawable.umayyad_city_ruins_sight));
        tours.add(new Tour(R.string.kamouh_al_hermel, R.string.hermel, R.drawable.kamouh_el_hermel_sight));
        tours.add(new Tour(R.string.temple_of_echmun, R.string.sidon, R.drawable.temple_of_echmun_sight));
        tours.add(new Tour(R.string.ruins_of_tyre, R.string.tyre, R.drawable.ruins_of_tyre_sight));
        tours.add(new Tour(R.string.stone_pregnant_woman, R.string.baalbek, R.drawable.stone_of_pregnant_sight));

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

