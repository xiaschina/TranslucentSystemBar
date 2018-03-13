package com.xias.demo.translucentsystembar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xias.demo.translucentsystembar.util.StatusBarCompat;


public class TvOneFragment extends Fragment {

    public TvOneFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static TvOneFragment newInstance() {
        TvOneFragment fragment = new TvOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv_one, container, false);
        ((ContentActivity)getActivity()).setStatusOne();
        return view;
    }
}
