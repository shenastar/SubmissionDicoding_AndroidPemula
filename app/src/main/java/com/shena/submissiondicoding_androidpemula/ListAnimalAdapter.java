package com.shena.submissiondicoding_androidpemula;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAnimalAdapter extends RecyclerView.Adapter<ListAnimalAdapter.ListViewHolder> {

    private ArrayList<Animal> listAnimal;
    private onItemClickCallBack onItemClickCallBack;

    public ListAnimalAdapter(ArrayList<Animal> listAnimal) {
        this.listAnimal = listAnimal;
    }

    public void setOnItemClickCallBack(ListAnimalAdapter.onItemClickCallBack onItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_animal, viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int i) {
        Animal animal = listAnimal.get(i);

        Glide.with(listViewHolder.itemView.getContext())
                .load(animal.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(listViewHolder.imgPhoto);
        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallBack.onItemClicked(listAnimal.get(listViewHolder.getAdapterPosition()));
            }
        });
        listViewHolder.tvName.setText(animal.getName());
        listViewHolder.tvInfo.setText(animal.getInfo());
    }

    @Override
    public int getItemCount() {
        return listAnimal.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvInfo;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvInfo = itemView.findViewById(R.id.tv_item_info);
        }
    }

    public interface onItemClickCallBack{
        void onItemClicked(Animal data);
    }
}
