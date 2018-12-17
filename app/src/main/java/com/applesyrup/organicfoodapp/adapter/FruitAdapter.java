package com.applesyrup.organicfoodapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.applesyrup.organicfoodapp.R;
import com.applesyrup.organicfoodapp.entity.Fruit;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {


    private ArrayList<Fruit> fruits;
    private Context context;

    private ArrayList<Fruit> getFruits() {
        return fruits;
    }

    public FruitAdapter(Context context) {
        this.context = context;
    }

    public void setFruits(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }


    @NonNull
    @Override
    public FruitViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_fruit, viewGroup, false);
        return new FruitViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull FruitViewHolder fruitViewHolder, int position) {
        fruitViewHolder.tvFruit.setText(getFruits().get(position).getNameFruit());
        fruitViewHolder.tvFruitLatin.setText(getFruits().get(position).getLatinFruit());
        Glide.with(context).load(getFruits().get(position).getUrlImgFruit()).into(fruitViewHolder.imgFruit);
    }

    @Override
    public int getItemCount() {
        return getFruits().size();
    }

    public class FruitViewHolder extends RecyclerView.ViewHolder {

        ImageView imgFruit;
        TextView tvFruit;
        TextView tvFruitLatin;

        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFruit = itemView.findViewById(R.id.img_fruit);
            tvFruit = itemView.findViewById(R.id.tv_fruit);
            tvFruitLatin = itemView.findViewById(R.id.tv_fruit_latin);

        }
    }
}
