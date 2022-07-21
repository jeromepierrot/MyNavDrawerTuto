package com.openclassrooms.mynavdrawer.Controllers.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.mynavdrawer.R;

public class ParamsPageFragment extends Fragment {

    public ParamsPageFragment() {
        // Required empty public constructor
    }

    public static ParamsPageFragment newInstance() {
        return new ParamsPageFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_params_page, container, false);
    }
}