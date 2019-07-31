package com.shena.submissiondicoding_androidpemula;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.io.Serializable;
import java.util.ArrayList;

public class FavoriteAnimalAdapter extends RecyclerView.Adapter<FavoriteAnimalAdapter.CardViewViewHolder> implements Serializable {

    private ArrayList<Animal> listAnimal;

    public FavoriteAnimalAdapter(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_animal, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder cardViewViewHolder, int i) {
        final Animal animal = listAnimal.get(i);
        Glide.with(cardViewViewHolder.itemView.getContext())
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(animal.getName());
        cardViewViewHolder.tvInfo.setText(animal.getInfo());
        cardViewViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        int size = 0;
        try{
            size =  listAnimal.size();
        }catch(NullPointerException e){
            size = 0;
        }
        return size;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView tvName, tvInfo;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvInfo = itemView.findViewById(R.id.tv_item_info);
        }
    }
    public ArrayList<Animal> lisFav = new ArrayList<>();

}
