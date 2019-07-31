package com.shena.submissiondicoding_androidpemula;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable{

    private RecyclerView rvAnimal;
    private ArrayList<Animal> list = new ArrayList<>(), tampungFavorite = new ArrayList<>();
    private AnimalData favorite = new AnimalData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences preferences = getSharedPreferences("FavoriteID",0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear().commit();
        rvAnimal = findViewById(R.id.rv_animal);
        rvAnimal.setHasFixedSize(true);
        list.addAll(favorite.getListAnimal());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
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

    private void showFavoriteAnimal(){
        rvAnimal.setLayoutManager(new LinearLayoutManager(this));
        FavoriteAnimalAdapter favoriteAnimalAdapter = new FavoriteAnimalAdapter(tampungFavorite);
        rvAnimal.setAdapter(favoriteAnimalAdapter);
        favoriteAnimalAdapter.setOnItemClickCallBack(new FavoriteAnimalAdapter.onItemClickCallBack() {
            @Override
            public void onItemClicked(Animal data) {
                removeFavorite(data);
                Toast.makeText(MainActivity.this,data.getName()+" Berhasil dihapus dari Favorite"
                        ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClickBack(Animal data) {
                showSelectedAnimal(data);
            }
        });
    }

    public void showSelectedAnimal(Animal data){
        Intent moveDetail = new Intent(MainActivity.this, DetailActivity.class);
        moveDetail.putExtra("EXTRA_DATA",data);
        startActivity(moveDetail);
    }

    public void setMode(int selectMode){
        switch (selectMode){
            case R.id.action_main:
                showRecyclerList();
                break;
            case R.id.action_favorite:
                showFavoriteAnimal();
                break;
        }
    }

    public void removeFavorite(Animal data){
        tampungFavorite.remove(data);
        showFavoriteAnimal();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences("FavoriteID",0);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear().commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        SharedPreferences preferences = getSharedPreferences("FavoriteID",0);
        String name = preferences.getString("nameAnimFav","null");
        String info = preferences.getString("infoAnimFav","null");
        String img = preferences.getString("imgAnimFav","null");
        String latin = preferences.getString("latinAnimFav","null");
        String habitat = preferences.getString("habitatAnimFav","null");
        String ilmiah = preferences.getString("ilmiahAnimFav","null");
        boolean sameName = false;
        if(name != "null"){
            Animal animFav = new Animal();
            for(int i = 0; i < tampungFavorite.size(); i++){
                if(name.equals(tampungFavorite.get(i).getName())){
                    sameName = true;
                }
            }
            if(!sameName) {
                animFav.setName(name);
                animFav.setInfo(info);
                animFav.setPhoto(img);
                animFav.setLatin(latin);
                animFav.setHabitat(habitat);
                animFav.setKlasifikasiIlmiah(ilmiah);
                tampungFavorite.add(animFav);
            }
        }
    }

}
