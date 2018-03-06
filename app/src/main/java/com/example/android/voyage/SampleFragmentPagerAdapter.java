package com.example.android.voyage;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"Numbers", "Family", "Colors", "Phrases"};
    private Context mContext;

    public SampleFragmentPagerAdapter(Context context, FragmentManager fm) {

        super(fm);
        mContext = context;
    }

    //will call the activity of the current tab selected
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RestaurentFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new BeachFragment();
        } else {
            return new SiteSeeingFragment();
        }
    }

    //will obtain the number of tabs available
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    //will place the title of each tab when selected
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_restaurent);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotel);
        } else if (position == 2) {
            return mContext.getString(R.string.category_beach);
        } else
            return mContext.getString(R.string.category_sightseeing);

    }
}