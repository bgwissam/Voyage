package com.example.android.voyage;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurentFragment extends Fragment {

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
        tours.add(new Tour(R.string.mayrin, R.string.beirut, R.drawable.mayring_rest));
        tours.add(new Tour(R.string.liza, R.string.beirut, R.drawable.liza_rest));
        tours.add(new Tour(R.string.enab, R.string.beirut, R.drawable.enab_rest));
        tours.add(new Tour(R.string.batching, R.string.dbayeh, R.drawable.batching_rest));
        tours.add(new Tour(R.string.cafe_em_nazih, R.string.beirut, R.drawable.cafe_em_nazih_rest));
        tours.add(new Tour(R.string.mounir, R.string.broumana, R.drawable.mounir_rest));
        tours.add(new Tour(R.string.couqley_frensh_bistro, R.string.beirut, R.drawable.couqley_branch_bistro_rest));
        tours.add(new Tour(R.string.em_sherif, R.string.beirut, R.drawable.em_sherif_rest));
        tours.add(new Tour(R.string.al_sultan_ibrahim, R.string.beirut, R.drawable.alsultan_ibrahim_rest));
        tours.add(new Tour(R.string.al_falamanky, R.string.beirut, R.drawable.al_falamnky_rest));

        TourAdapter itemsAdapter = new TourAdapter(getActivity(), tours, R.color.category_restaurent);

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

