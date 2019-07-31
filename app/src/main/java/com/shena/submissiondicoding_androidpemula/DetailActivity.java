package com.shena.submissiondicoding_androidpemula;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.Serializable;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements Serializable{

    private ImageView detailPhoto;
    private Button btnFavorite;
    private ArrayList<Animal> favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_animal);
        detailPhoto = findViewById(R.id.img_detail_photo);
        final Animal data = (Animal)getIntent().getSerializableExtra("EXTRA_DATA");
        final ArrayList<Animal> allData = (ArrayList<Animal>) getIntent().getSerializableExtra("EXTRA_ALLDATA");
        Glide.with(this)
                .load(data.getPhoto())
                .apply(new RequestOptions().override(550,350))
                .into(detailPhoto);
        btnFavorite = findViewById(R.id.btn_set_favorite);
        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences jav = getSharedPreferences("FavoriteID", 0);
                SharedPreferences.Editor editor  = jav.edit();
                editor.putString("nameAnimFav", data.getName());
                editor.putString("infoAnimFav", data.getInfo());
                editor.putString("imgAnimFav", data.getPhoto());
                editor.commit();
            }
        });
    }
}
