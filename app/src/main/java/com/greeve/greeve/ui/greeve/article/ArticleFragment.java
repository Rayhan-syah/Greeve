package com.greeve.greeve.ui.greeve.article;


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
import com.greeve.greeve.models.Article;

import java.util.ArrayList;
import java.util.List;


public class ArticleFragment extends Fragment {

    View v;
    RecyclerView myrecyclerview;
    List<Article> lstArticles;


    public ArticleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_article,container,false);
        // Inflate the layout for this fragment
        myrecyclerview = (RecyclerView) v.findViewById(R.id.rv_heroes_article);
        ArticleRecycleViewAdapter recycleViewAdapter = new ArticleRecycleViewAdapter(getContext(),lstArticles);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleViewAdapter);

        return v;

    }
//Ini tambah data
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstArticles = new ArrayList<>();
        lstArticles.add(new Article("Hello","https://greevelaw.files.wordpress.com/2020/02/screenshot_2020-02-21-mengurangi-sampah-popok-mengolahnya-menjadi-pupuk-e28094-zerowaste-id.png","https://greeve.law.blog/2020/02/21/mengurangi-sampah-popok-mengolahnya-menjadi-pupuk"));
    }

}
