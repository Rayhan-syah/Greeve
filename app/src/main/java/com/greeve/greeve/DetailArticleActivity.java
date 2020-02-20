package com.greeve.greeve;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailArticleActivity extends AppCompatActivity {


    private TextView dTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_article);

        dTitle = (TextView) findViewById(R.id.title_detail_article);
        Intent intent = getIntent();
        dTitle.setText(intent.getStringExtra("Title"));
    }
}
