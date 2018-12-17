package com.applesyrup.organicfoodapp.entity;

/**
 * Created by amaliaqis on 12/6/2018.
 */
public class Fruit {
    private String nameFruit, latinFruit, urlImgFruit;

    public Fruit() {
    }

    public Fruit(String nameFruit, String latinFruit, String urlImgFruit) {
        this.nameFruit = nameFruit;
        this.latinFruit = latinFruit;
        this.urlImgFruit = urlImgFruit;
    }

    public String getNameFruit() {
        return nameFruit;
    }

    public void setNameFruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getLatinFruit() {
        return latinFruit;
    }

    public void setLatinFruit(String latinFruit) {
        this.latinFruit = latinFruit;
    }

    public String getUrlImgFruit() {
        return urlImgFruit;
    }

    public void setUrlImgFruit(String urlImgFruit) {
        this.urlImgFruit = urlImgFruit;
    }


}
