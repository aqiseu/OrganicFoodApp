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
import com.applesyrup.organicfoodapp.entity.Vege;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class VegeAdapter extends RecyclerView.Adapter<VegeAdapter.VegeViewHolder> {


    private ArrayList<Vege> veges;
    private Context context;

    private ArrayList<Vege> getVeges() {
        return veges;
    }

    public VegeAdapter(Context context) {
        this.context = context;
    }

    public void setVeges(ArrayList<Vege> veges) {
        this.veges = veges;
    }


    @NonNull
    @Override
    public VegeViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_vege, viewGroup, false);
        return new VegeViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull VegeViewHolder vegeViewHolder, int position) {
        vegeViewHolder.tvVege.setText(getVeges().get(position).getNameVege());
        vegeViewHolder.tvVegeLatin.setText(getVeges().get(position).getLatinVege());

        Glide.with(context).load(getVeges().get(position).getUrlImgVege()).into(vegeViewHolder.imgVege);

    }

    @Override
    public int getItemCount() {
        return getVeges().size();
    }

    public class VegeViewHolder extends RecyclerView.ViewHolder {

        ImageView imgVege;
        TextView tvVege;
        TextView tvVegeLatin;

        public VegeViewHolder(@NonNull View itemView) {
            super(itemView);
            imgVege = itemView.findViewById(R.id.img_vege);
            tvVege = itemView.findViewById(R.id.tv_vege);
            tvVegeLatin = itemView.findViewById(R.id.tv_vege_latin);


        }
    }
}
