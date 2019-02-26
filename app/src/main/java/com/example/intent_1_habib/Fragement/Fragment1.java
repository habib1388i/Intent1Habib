package com.example.intent_1_habib.Fragement;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intent_1_habib.Adapter.FragmentAdapter;
import com.example.intent_1_habib.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

RecyclerView rv;
FragmentAdapter adapter;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        rv = view.findViewById(R.id.rv_fragment1);
        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rv.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        adapter = new FragmentAdapter(getActivity());
        rv.setAdapter(adapter);

    }
}
