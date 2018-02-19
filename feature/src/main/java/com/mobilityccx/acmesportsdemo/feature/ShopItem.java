package com.mobilityccx.acmesportsdemo.feature;

import java.io.Serializable;

/**
 * Created by Satya on 07/02/18.
 */

public class ShopItem implements Serializable{

    private Integer src;
    private String name;

    public  int getSrc() {
        return src;
    }

    public void setSrc(int src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
