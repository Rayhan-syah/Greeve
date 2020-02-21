package com.greeve.greeve.ui.greeve.tutorial;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greeve.greeve.R;
import com.greeve.greeve.adapters.ArticleRecycleViewAdapter;
import com.greeve.greeve.adapters.TutorialRecycleViewAdapter;
import com.greeve.greeve.models.Article;
import com.greeve.greeve.models.Tutorial;

import java.util.ArrayList;
import java.util.List;


public class TutorialFragment extends Fragment {


    private View v;
    private RecyclerView myrecyclerview;
    private List<Tutorial> lstTutorial;

    public TutorialFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_tutorial,container,false);
        // Inflate the layout for this fragment
        myrecyclerview = (RecyclerView) v.findViewById(R.id.rv_heroes_tutorial);
        TutorialRecycleViewAdapter recycleViewAdapter = new TutorialRecycleViewAdapter(getContext(),lstTutorial);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleViewAdapter);

        return v;
    }

    //Ini tambah data
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstTutorial = new ArrayList<>();
        lstTutorial.add(new Tutorial("Hai", R.raw.videos1));

    }

}
