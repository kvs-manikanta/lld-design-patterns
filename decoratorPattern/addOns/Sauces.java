package org.example.decoratorPattern.addOns;

import org.example.decoratorPattern.SubWay;

public class Sauces implements SubWay {
    public SubWay subWay;

    public Sauces(SubWay subWay)
    {
        this.subWay=subWay;
    }

    @Override
    public int getPrice() {
        return subWay.getPrice()+25;
    }

    @Override
    public String getDescription() {
        return subWay.getDescription()+" Added the diff Sauces +";
    }
}
