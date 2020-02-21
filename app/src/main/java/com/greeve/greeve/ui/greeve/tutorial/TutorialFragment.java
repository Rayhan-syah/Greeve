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
        myrecyclerview.setHasFixedSize(true);
        myrecyclerview.setAdapter(recycleViewAdapter);

        return v;
    }

    //Ini tambah data
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstTutorial = new ArrayList<>();
        lstTutorial.add(new Tutorial("Kertas Jadi Topeng","https://firebasestorage.googleapis.com/v0/b/greeve-gr.appspot.com/o/Topeng%20kertas.mp4?alt=media&token=502a6d9e-ce0b-430f-a246-db06ce1d31fc"));
        lstTutorial.add(new Tutorial("Pesawat Dari Kerta","https://firebasestorage.googleapis.com/v0/b/greeve-gr.appspot.com/o/Pesawat%20dari%20kertas.mp4?alt=media&token=f505e4a0-cf75-430a-9417-361b122f7494"));
        lstTutorial.add(new Tutorial("Cumi Cumi Kertas","https://firebasestorage.googleapis.com/v0/b/greeve-gr.appspot.com/o/Cumi-cumi%20kertas.mp4?alt=media&token=cae9b16a-bc2a-42de-9f42-d9d838f204ef"));
        lstTutorial.add(new Tutorial("Kapal kertas","https://firebasestorage.googleapis.com/v0/b/greeve-gr.appspot.com/o/Kapal%20kertas.mp4?alt=media&token=460bf172-a86b-4ddd-887c-df005dc64221"));
        lstTutorial.add(new Tutorial("Celemek dari bahan bekad","https://firebasestorage.googleapis.com/v0/b/greeve-gr.appspot.com/o/1.mp4?alt=media&token=0da09d4a-348f-4cf3-a115-2c88be541648"));
    }

}
