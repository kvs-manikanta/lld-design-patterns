package org.example.decoratorPattern.addOns;

import org.example.decoratorPattern.SubWay;

public class Meat implements SubWay {
    public SubWay subWay;

    public Meat(SubWay subWay)
    {
        this.subWay=subWay;
    }
    @Override
    public int getPrice() {
        return subWay.getPrice()+50;
    }

    @Override
    public String getDescription() {
        return subWay.getDescription()+" Added requested Meat ";
    }
}
