package com.example.android.voyage;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachFragment extends Fragment {

    public BeachFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        //numbers array
        final ArrayList<Tour> tours = new ArrayList<Tour>();

        //list of tours
        tours.add(new Tour(R.string.iris_beach_club, R.string.mount_lebanon_damour, R.drawable.iris_beach_club));
        tours.add(new Tour(R.string.white_beach, R.string.batroun_thoum, R.drawable.white_beach));
        tours.add(new Tour(R.string.pierre_friends, R.string.byblous_madfoun, R.drawable.pierre___friends_beach));
        tours.add(new Tour(R.string.c_flow_beach, R.string.byblous, R.drawable.c_flow_beach_resort));
        tours.add(new Tour(R.string.janna_sur_mer, R.string.mount_lebanon_damour, R.drawable.janna_sur_mer_beach));
        tours.add(new Tour(R.string.eddesands_resort, R.string.batroun_sea_side, R.drawable.eddesands_resort_beach));
        tours.add(new Tour(R.string.lazy_b_beach, R.string.jiye_main_st_, R.drawable.lazy_b_beach));
        tours.add(new Tour(R.string.o_glacee_beach, R.string.batroun_sea_side, R.drawable.o_glacee_beach));
        tours.add(new Tour(R.string.jonas_beach, R.string.jiye_sea_side, R.drawable.jonas_beach));
        tours.add(new Tour(R.string.warwick_pangea_beach, R.string.jiye_sea_side, R.drawable.warwick_pangea_beach));

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
