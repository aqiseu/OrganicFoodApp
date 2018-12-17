package com.applesyrup.organicfoodapp.main.fragment.fruit;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.applesyrup.organicfoodapp.R;
import com.applesyrup.organicfoodapp.adapter.FruitAdapter;
import com.applesyrup.organicfoodapp.entity.Fruit;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class FruitFragment extends Fragment implements FruitContract {


    RecyclerView rvFruit;
    ArrayList<Fruit> fruitArrayList = new ArrayList<>();


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fruit, container, false);

        rvFruit = view.findViewById(R.id.rv_fruit);
        rvFruit.setHasFixedSize(true);

        fruitArrayList.addAll(FruitPresenter.getListFruit());

        showRecyclerFruit();
        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void showRecyclerFruit() {
        rvFruit.setLayoutManager(new LinearLayoutManager(getActivity()));
        FruitAdapter fruitAdapter = new FruitAdapter(getActivity());
        fruitAdapter.setFruits(fruitArrayList);
        rvFruit.setAdapter(fruitAdapter);

    }
}
