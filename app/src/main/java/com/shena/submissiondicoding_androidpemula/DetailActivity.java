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
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.Serializable;
import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements Serializable{

    private TextView detailName, detailInfo, detailLatin, detailhabitat, detailIlmiah;
    private ImageView detailPhoto;
    private Button btnFavorite;
    private ArrayList<Animal> favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailName = findViewById(R.id.tv_detail_name);
        detailInfo = findViewById(R.id.tv_detail_info);
        detailPhoto = findViewById(R.id.img_detail_photo);
        detailLatin = findViewById(R.id.tv_detail_latin);
        detailhabitat = findViewById(R.id.tv_detail_habitat);
        detailIlmiah = findViewById(R.id.tv_detail_ilmiah);
        final Animal data = (Animal)getIntent().getSerializableExtra("EXTRA_DATA");
        Glide.with(this)
                .load(data.getPhoto())
                .apply(new RequestOptions().override(550,350))
                .into(detailPhoto);
        detailName.setText(data.getName());
        detailInfo.setText(data.getInfo());
        detailLatin.setText(data.getLatin());
        detailhabitat.setText(data.getHabitat());
        detailIlmiah.setText(data.getKlasifikasiIlmiah());
        btnFavorite = findViewById(R.id.btn_set_favorite);
        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences jav = getSharedPreferences("FavoriteID", 0);
                SharedPreferences.Editor editor  = jav.edit();
                editor.putString("nameAnimFav", data.getName());
                editor.putString("infoAnimFav", data.getInfo());
                editor.putString("imgAnimFav", data.getPhoto());
                editor.putString("latinAnimFav", data.getLatin());
                editor.putString("habitatAnimFav", data.getHabitat());
                editor.putString("ilmiahAnimFav", data.getKlasifikasiIlmiah());
                editor.commit();
                Toast.makeText(DetailActivity.this,data.getName()+" ditambahkan ke Favorite",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
