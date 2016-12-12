package com.yixingu.buttonstyles.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yixingu.buttonstyles.R;

/**
 * Created by likaisong on 16-12-12.
 */

public class PlaceholderFragment extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment() {
    }

    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int sectionNumber = getArguments().getInt(ARG_SECTION_NUMBER);
        View rootView = inflater.inflate(R.layout.fragment_main_activity, container, false);
        switch (sectionNumber) {
            case 1:
                rootView = inflater.inflate(R.layout.square_buttons, container, false);
                break;
            case 2:
                rootView = inflater.inflate(R.layout.square_button_transparent, container, false);
                break;
            case 3:
                rootView = inflater.inflate(R.layout.regular_buttons, container, false);
                break;
            case 4:
                rootView = inflater.inflate(R.layout.regular_transparent, container, false);
                break;
            case 5:
                rootView = inflater.inflate(R.layout.regular_rounded, container, false);
                break;
            case 6:
                rootView = inflater.inflate(R.layout.circular_button, container, false);
                break;
            case 7:
                rootView = inflater.inflate(R.layout.circular_transparent, container, false);
                break;
        }

        return rootView;

    }
}
