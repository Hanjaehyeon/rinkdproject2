package com.example.rinkdproject.cafemenu;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.widget.ImageView;

public class Cafe {

    String name;
    int image;
    Intent intent;



    public Cafe(int image, String name) {
        this.image = image;
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage(){
        return image;
    }

    public Intent getIntent(){
        return intent;
    }



}
