package com.moringaschool.myrestaurants.util;

import com.moringaschool.myrestaurants.models.Business;

import java.util.ArrayList;

public interface OnRestaurantSelectedListener {
    public void onRestaurantSelected(Integer position, ArrayList<Business> restaurants);
}
