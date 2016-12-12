package com.yixingu.buttonstyles.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.yixingu.buttonstyles.fragment.PlaceholderFragment;

/**
 * Created by likaisong on 16-12-12.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return PlaceholderFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Square Button";
            case 1:
                return "Square Transparent";
            case 2:
                return "Regular Button";
            case 3:
                return "Rounded Transparent";
            case 4:
                return "Regular Rounded";
            case 5:
                return "Circular";
            case 6:
                return "Circular Transparent";
        }
        return null;
    }
}
