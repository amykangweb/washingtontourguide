package net.amykang.washingtontourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.lang.ref.Reference;

// Source: https://www.codingdemos.com/android-tablayout-example-viewpager/

public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MuseumsFragment();
            case 1:
                return new ParksFragment();
            case 2:
                return new ZoosFragment();
            case 3:
                return new FoodFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    // Source: https://stackoverflow.com/questions/36017717/tabindicator-is-not-sliding-from-one-to-another-tab-in-tablayout-when-i-swipe-be
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position) {
            case 0:
                return "Museums";
            case 1:
                return "Parks";
            case 2:
                return "Zoos";
            case 3:
                return "Food";
            default:
                return null;
        }
    }
}
