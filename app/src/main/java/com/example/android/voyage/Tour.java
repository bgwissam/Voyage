package com.example.android.voyage;



public class Tour {

    //Create a variable for the miwak translation
    private  String mPlaceName;
    //Create a variable for the default translation
    private  String mPlaceAddress;
    //create an int variable to hold the image resource id
    private int mImageId = NO_IMAGE_VARIABLE;
    //create a no image variable
    private static final int NO_IMAGE_VARIABLE = -1;
    //create an int variable for the sound raw data
    private int mPlaceImage;
    //creat variable for the play arrow icon
    private int mPlayArrow;

    //default constructor
    public Tour(String placeName, String placeAddress, int placeImage){
        mPlaceName = placeName;

        mPlaceAddress = placeAddress;

        mPlaceImage = placeImage;

    }
    public Tour(String placeName, String placeAddress, int placeImage, int tobeDefined ){
        mPlaceName = placeName;

        mPlaceAddress = placeAddress;

        mPlaceImage = placeImage;


    }
    //will call the translation of the default language
    public String getmPlaceName() {
        return mPlaceName;

    }
    //will call the MyTour word
    public String getPlaceAddress (){
        return mPlaceAddress;
    }
    //will call the image reference associated with the MyTour word
    public int getPlaceImage (){
        return  mPlaceImage;
    }

    public boolean checkImage () {
        return mPlaceImage != NO_IMAGE_VARIABLE;    }




}


