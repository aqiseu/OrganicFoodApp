package com.applesyrup.organicfoodapp.main.fragment.vege;

import com.applesyrup.organicfoodapp.entity.DummyData;
import com.applesyrup.organicfoodapp.entity.Vege;
import com.applesyrup.organicfoodapp.main.fragment.vege.VegeContract;

import java.util.ArrayList;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class VegePresenter {

    VegeContract view;

    public static ArrayList<Vege> getListVege() {

        Vege vege = null;
        ArrayList<Vege> vegelist = new ArrayList<>();

        for (String[] aData : DummyData.datavege){
            vege = new Vege();
            vege.setNameVege(aData[0]);
            vege.setLatinVege(aData[1]);
            vege.setUrlImgVege(aData[2]);

            vegelist.add(vege);
        }

        return vegelist;

    }

}
