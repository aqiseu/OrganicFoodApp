package com.applesyrup.organicfoodapp.main.fragment.fruit;

import com.applesyrup.organicfoodapp.entity.DummyData;
import com.applesyrup.organicfoodapp.entity.Fruit;

import java.util.ArrayList;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class FruitPresenter {

    FruitContract view;

    public static ArrayList<Fruit> getListFruit() {

        Fruit fruit = null;
        ArrayList<Fruit> fruitlist = new ArrayList<>();

        for (String[] aData : DummyData.datafruit){
            fruit = new Fruit();
            fruit.setNameFruit(aData[0]);
            fruit.setLatinFruit(aData[1]);
            fruit.setUrlImgFruit(aData[2]);

            fruitlist.add(fruit);
        }

        return fruitlist;

    }


}
