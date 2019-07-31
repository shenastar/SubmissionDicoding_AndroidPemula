package com.shena.submissiondicoding_androidpemula;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
    public void onBindViewHolder(@NonNull final CardViewViewHolder cardViewViewHolder, int i) {
        final Animal animal = listAnimal.get(i);
        Glide.with(cardViewViewHolder.itemView.getContext())
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(350,550))
                .into(cardViewViewHolder.imgPhoto);
        cardViewViewHolder.tvName.setText(animal.getName());
        cardViewViewHolder.tvInfo.setText(animal.getInfo());
        cardViewViewHolder.btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listAnimal.get(cardViewViewHolder.getAdapterPosition()));
            }
        });
        cardViewViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClickBack(listAnimal.get(cardViewViewHolder.getAdapterPosition()));
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
        Button btnRemove;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvInfo = itemView.findViewById(R.id.tv_item_info);
            btnRemove = itemView.findViewById(R.id.btn_set_favorite);
        }
    }
    private onItemClickCallBack onItemClickCallBack;

    public void setOnItemClickCallBack(FavoriteAnimalAdapter.onItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    public interface onItemClickCallBack{
        void onItemClicked(Animal data);
        void onItemClickBack(Animal data);
    }

}
