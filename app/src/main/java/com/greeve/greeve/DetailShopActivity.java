package com.greeve.greeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailShopActivity extends AppCompatActivity {


    private TextView dTitle;
    private ImageView dImage;
    private TextView dPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_shop);


        dTitle = (TextView) findViewById(R.id.tv_title_detail_shop);
        dImage = (ImageView) findViewById(R.id.img_view_detail_shop);
        dPrice = (TextView) findViewById(R.id.tv_title_detail_harga);
        Intent intent = getIntent();
        dTitle.setText(intent.getStringExtra("Title"));
        dPrice.setText(intent.getStringExtra("Price"));
//        switch (dTitle.getText().toString()){
//            case R.string.title_article1:
//                break;
//        }
        if (dTitle.getText().toString().equals("Satu")){
            dImage.setImageResource(R.drawable.ic_add_box_black_24dp);
        }
    }
}
