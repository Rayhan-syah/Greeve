package com.greeve.greeve.ui.greeve.shop;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.greeve.greeve.R;
import com.greeve.greeve.adapters.ArticleRecycleViewAdapter;
import com.greeve.greeve.adapters.ShopRecycleViewAdapter;
import com.greeve.greeve.models.Shop;

import java.util.ArrayList;
import java.util.List;


public class ShopFragment extends Fragment {

    private View v;
    private RecyclerView myrecycleview;
    private List<Shop> lstShop;

    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_shop,container,false);
        myrecycleview = (RecyclerView) v.findViewById(R.id.rv_heroes_shop);
        ShopRecycleViewAdapter recycleViewAdapter = new ShopRecycleViewAdapter(getContext(),lstShop);
        myrecycleview.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrecycleview.setAdapter(recycleViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstShop = new ArrayList<>();
        lstShop.add(new Shop("Satu","Rp. 2000",R.drawable.ic_add_box_black_24dp));
        lstShop.add(new Shop("Dua","Rp. 4000",R.drawable.ic_add_shopping_cart_black_24dp));
        lstShop.add(new Shop("Tiga","Rp. 6000",R.drawable.ic_arrow_forward_black_24dp));
        lstShop.add(new Shop("Empat","Rp. 8000",R.drawable.article1));
        lstShop.add(new Shop("Lima","Rp. 10000",R.drawable.ic_library_books_black_24dp));
        lstShop.add(new Shop("Enam","Rp. 12000",R.drawable.img_hero));
    }
}
