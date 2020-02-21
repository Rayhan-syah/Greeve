package com.greeve.greeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailArticleActivity extends AppCompatActivity {


    private TextView dTitle;
    private ImageView dImage;
    private TextView dDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_article);

        dTitle = (TextView) findViewById(R.id.title_detail_article);
        dImage = (ImageView) findViewById(R.id.img_view_detail);
        dDesc = (TextView) findViewById(R.id.tv_desc_article_detail);
        Intent intent = getIntent();
        dTitle.setText(intent.getStringExtra("Title"));
//        switch (dTitle.getText().toString()){
//            case R.string.title_article1:
//                break;
//        }
        if (dTitle.getText().toString().equals("Lerak sebagai alternatif deterjen dan sabun")){
            dImage.setImageResource(R.drawable.article1);
            dDesc.setText(R.string.desc_article1);
        }

    }
}
