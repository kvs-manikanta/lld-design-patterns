package org.example.decoratorPattern.breads;

import org.example.decoratorPattern.SubWay;

public class BrownBread implements SubWay {
    public SubWay subWay;

    public BrownBread(SubWay subWay)
    {
        this.subWay=subWay;
    }

    public BrownBread(){}

    @Override
    public int getPrice() {
        if(subWay==null)
        {
            return 20;
        }
        return subWay.getPrice()+20;
    }

    @Override
    public String getDescription() {
        if(subWay==null)
        {
            return "Brown Bread +";
        }
        return subWay.getDescription()+"Brown Bread  +";
    }
}
