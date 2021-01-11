package com.moringaschool.myrestaurants;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyRestaurantArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyRestaurantArrayAdapter(Context mContext, int resources, String[] mRestaurants, String[] mCuisines){
        super(mContext, resources);
        this.mContext = mContext;
        this.mRestaurants = mRestaurants;
        this.mCuisines = mCuisines;
    }

    @Override
    public Object getItem(int position){
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%s \nServes great: %s", restaurant, cuisine);
    }

    @Override
    public int getCount(){
        return mRestaurants.length;
    }
}
