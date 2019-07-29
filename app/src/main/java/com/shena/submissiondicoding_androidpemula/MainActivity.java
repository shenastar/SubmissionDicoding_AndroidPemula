package com.shena.submissiondicoding_androidpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvAnimal;
    private ArrayList<Animal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAnimal = findViewById(R.id.rv_animal);
        rvAnimal.setHasFixedSize(true);
        list.addAll(AnimalData.getListAnimal());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvAnimal.setLayoutManager(new LinearLayoutManager(this));
        ListAnimalAdapter listHeroAdapter = new ListAnimalAdapter(list);
        rvAnimal.setAdapter(listHeroAdapter);
        listHeroAdapter.setOnItemClickCallBack(new ListAnimalAdapter.onItemClickCallBack() {
            @Override
            public void onItemClicked(Animal data) {
                showSelectedAnimal(data);
            }
        });
    }
    private void showSelectedAnimal(Animal data){
        Intent moveDetail = new Intent(MainActivity.this, DetailActivity.class);
        moveDetail.putExtra("EXTRA_DATA",data);
        startActivity(moveDetail);
    }
}
