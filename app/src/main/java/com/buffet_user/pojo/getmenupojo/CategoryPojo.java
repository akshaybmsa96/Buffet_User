package com.buffet_user.pojo.getmenupojo;

import java.util.ArrayList;

/**
 * Created by akshaybmsa96 on 01/11/17.
 */

public class CategoryPojo {
    private ArrayList<SingleMenuPojo> Sides;
    private ArrayList<SingleMenuPojo> Pizza;


    public ArrayList<SingleMenuPojo> getSides() {
        return Sides;
    }

    public void setSides(ArrayList<SingleMenuPojo> sides) {
        Sides = sides;
    }

    public ArrayList<SingleMenuPojo> getPizza() {
        return Pizza;
    }

    public void setPizza(ArrayList<SingleMenuPojo> pizza) {
        Pizza = pizza;
    }
}
