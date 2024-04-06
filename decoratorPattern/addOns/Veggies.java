package org.example.decoratorPattern.addOns;

import org.example.decoratorPattern.SubWay;
import org.example.decoratorPattern.breads.WheatBread;

public class Veggies implements SubWay {

    public SubWay subWay;

    public Veggies(SubWay subWay)
    {
        this.subWay=subWay;
    }
    @Override
    public int getPrice() {
        return subWay.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return subWay.getDescription()+" Added Veggies +";
    }
}
