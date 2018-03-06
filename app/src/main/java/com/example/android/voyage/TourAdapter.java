package com.example.android.voyage;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class TourAdapter extends ArrayAdapter<Tour> {
    private int mColorResourceId;
    private static final String LOG_TAG = TourAdapter.class.getSimpleName();

    public TourAdapter(Activity context, ArrayList<Tour> tours, int colorResourceId) {
        super(context,0, tours);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.places_view, parent, false);
        }
        //set color of the text container as per the category selected
        View textContainer = listItemView.findViewById(R.id.text_container);
        //get the color resource id
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //set the color to the layout
        textContainer.setBackgroundColor(color);
        //get the location of the object in the list
        Tour currentTour = getItem(position);
        //find the text view with the id miwak_text id
        TextView miwakText = (TextView) listItemView.findViewById(R.id.miwak_text);
        //set the text on the miwak text view
        miwakText.setText(currentTour.getmPlaceName());

        //find the text view with the english_text id
        TextView englishText = (TextView) listItemView.findViewById(R.id.english_text);
        //set the text on the text view
        englishText.setText(currentTour.getPlaceAddress());
        //sets the image view of the word and its translation
        ImageView imageResource = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentTour.checkImage()) {
            imageResource.setImageResource(currentTour.getPlaceImage());
            //make the image visible
            imageResource.setVisibility(View.VISIBLE);
        }
        else {
            //make the image invisible
            imageResource.setVisibility(View.GONE);
        }
        return listItemView;
    }


}
