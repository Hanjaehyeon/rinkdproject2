package com.example.rinkdproject.coffee;

import com.google.firebase.database.Query;

public class Drink {
    private String image;
    private String cafename;
    private String drinkname;
    private int price;

    private Query queryimage;
    private Query querycafename;
    private Query querydrinkname;
    private Query queryprice;

    public Drink(){}

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCafename() {
        return cafename;
    }

    public void setCafename(String cafename) {
        this.cafename = cafename;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDrinkname(){
        return drinkname;
    }

    public void setDrinkname(String drinkname){
        this.drinkname = drinkname;
    }


    public Query getQueryimage(){
        return queryimage;
    }

    public void setQueryimage(Query queryimage) {
        this.queryimage = queryimage;
    }

    public Query getQuerycafename() {
        return querycafename;
    }

    public void setQuerycafename(Query querycafename) {
        this.querycafename = querycafename;
    }

    public Query getQuerydrinkname() {
        return querydrinkname;
    }

    public void setQuerydrinkname(Query querydrinkname) {
        this.querydrinkname = querydrinkname;
    }

    public Query getQueryprice() {
        return queryprice;
    }

    public void setQueryprice(Query queryprice) {
        this.queryprice = queryprice;
    }
}
