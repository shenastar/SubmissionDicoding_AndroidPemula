package com.shena.submissiondicoding_androidpemula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity{

    public static String EXTRA_NAME;
    public static Animal EXTRA_DATA;
    private ImageView detailPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_animal);
        detailPhoto = findViewById(R.id.img_detail_photo);
        Animal data = (Animal)getIntent().getSerializableExtra("EXTRA_DATA");
        Glide.with(this)
                .load(data.getPhoto())
                .apply(new RequestOptions().override(550,350))
                .into(detailPhoto);
    }
}
