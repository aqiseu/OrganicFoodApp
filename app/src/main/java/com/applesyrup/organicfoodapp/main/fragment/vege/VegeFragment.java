package com.applesyrup.organicfoodapp.main.fragment.vege;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.applesyrup.organicfoodapp.R;
import com.applesyrup.organicfoodapp.adapter.VegeAdapter;
import com.applesyrup.organicfoodapp.entity.Fruit;
import com.applesyrup.organicfoodapp.entity.Vege;
import com.applesyrup.organicfoodapp.main.fragment.fruit.FruitPresenter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class VegeFragment extends Fragment implements VegeContract{


    RecyclerView rvVege;
    ArrayList<Vege> vegeArrayList = new ArrayList<>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vege, container, false);


        rvVege = view.findViewById(R.id.rv_vege);
        rvVege.setHasFixedSize(true);

        vegeArrayList.addAll(VegePresenter.getListVege());

        showRecyclerVege();
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override
    public void showRecyclerVege() {
        rvVege.setLayoutManager(new LinearLayoutManager(getActivity()));
        VegeAdapter vegeAdapter = new VegeAdapter(getActivity());
        vegeAdapter.setVeges(vegeArrayList);
        rvVege.setAdapter(vegeAdapter);
    }
}

