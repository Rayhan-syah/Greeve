package com.greeve.greeve.ui.greeve.article;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greeve.greeve.MainActivity;
import com.greeve.greeve.R;

import java.util.ArrayList;
import java.util.Arrays;


public class ArticleFragment extends Fragment {


    ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4"));
    ArrayList personImages = new ArrayList<>(Arrays.asList(R.drawable.ic_add_box_black_24dp, R.drawable.ic_add_box_black_24dp, R.drawable.ic_add_box_black_24dp, R.drawable.ic_add_box_black_24dp));

    public ArticleFragment() {
        // Required empty public constructor


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_article, container, false);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

// get the reference of RecyclerView
            RecyclerView recyclerView = (RecyclerView) getView().findViewById(R.id.recyclerView);
// set a LinearLayoutManager with default vertical orientaion
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
            recyclerView.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
// call the constructor of CustomAdapter to send the reference and data to Adapter
            CustomAdapter customAdapter = new CustomAdapter(getActivity().getApplicationContext(), personNames,personImages);
            recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView


    }
}
