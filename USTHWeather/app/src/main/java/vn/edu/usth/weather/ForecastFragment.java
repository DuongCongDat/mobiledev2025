package vn.edu.usth.weather;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup containter, Bundle savedInstanceState) {

        View view = new View(getActivity());
        int color = 0x20FF0000;
        view.setBackgroundColor(color);
        return view;
    }

}