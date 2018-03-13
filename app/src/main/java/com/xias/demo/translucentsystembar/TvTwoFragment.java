package com.xias.demo.translucentsystembar;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xias.demo.translucentsystembar.util.StatusBarCompat;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TvTwoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TvTwoFragment extends Fragment {


    public TvTwoFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static TvTwoFragment newInstance() {
        TvTwoFragment fragment = new TvTwoFragment();
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
        View view = inflater.inflate(R.layout.fragment_tv_two, container, false);
        ((ContentActivity)getActivity()).setStatusTwo();
        return view;
    }

}
