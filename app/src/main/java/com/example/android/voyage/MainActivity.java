
package com.example.android.voyage;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    //create a drawer layout variable to access the drawer view
    public DrawerLayout mDrawerLayout;
    //find the view pager that will allow the user to swipe between fragments
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setNavigationViewListner();
        // Set the content of the activity to use the activity_caetegory.xml layout file
        setContentView(R.layout.activity_main);

        mDrawerLayout = findViewById(R.id.drawer_layout);
        //set a listener on the navigation view
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                //set item as selected to persist highlight
                item.setChecked(true);
                //close drawer when item is tapped
                mDrawerLayout.closeDrawers();

                return true;
            }
        });

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        /*
        The following code adds the home button icon to the toolbar
         */
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);

        //create an adapter that knows which fragment should use which page
        LocationFragmentPageAdapter adapter = new LocationFragmentPageAdapter(this, getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        //give the fixed tab layout the view pager
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        //connect the tab layout with the view pager
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @SuppressWarnings("Tab is Empty")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        item.setChecked(true);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mDrawerLayout.closeDrawers();

        switch (item.getItemId()) {
            case R.id.nav_beaches: {
                fragmentManager.beginTransaction().replace(R.id.list_view, new BeachFragment()).commit();
                break;
            }
            case R.id.nav_hotels: {
                fragmentManager.beginTransaction().replace(R.id.list_view, new HotelFragment()).commit();
                break;
            }
            case R.id.nav_restaurent: {
                fragmentManager.beginTransaction().replace(R.id.list_view, new RestaurentFragment()).commit();
                break;
            }
            case R.id.nav_siteseeing: {
                fragmentManager.beginTransaction().replace(R.id.list_view, new SiteSeeingFragment()).commit();
                break;
            }
        }
        mDrawerLayout.closeDrawers();
        return true;
    }

    private void setNavigationViewListner() {

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView != null)
            navigationView.setNavigationItemSelectedListener(this);
    }
}
