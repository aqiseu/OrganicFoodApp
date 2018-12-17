package com.applesyrup.organicfoodapp.entity;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class Vege {

    private String nameVege, latinVege, urlImgVege;

    public Vege() {
    }

    public Vege(String nameVege, String latinVege, String urlImgVege) {
        this.nameVege = nameVege;
        this.latinVege = latinVege;
        this.urlImgVege = urlImgVege;
    }

    public String getNameVege() {
        return nameVege;
    }

    public void setNameVege(String nameVege) {
        this.nameVege = nameVege;
    }

    public String getLatinVege() {
        return latinVege;
    }

    public void setLatinVege(String latinVege) {
        this.latinVege = latinVege;
    }

    public String getUrlImgVege() {
        return urlImgVege;
    }

    public void setUrlImgVege(String urlImgVege) {
        this.urlImgVege = urlImgVege;
    }
}
