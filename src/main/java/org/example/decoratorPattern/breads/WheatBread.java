package org.example.decoratorPattern.breads;

import org.example.decoratorPattern.SubWay;

public class WheatBread implements SubWay {

    public SubWay subWay;

    public WheatBread(){}

    public WheatBread(SubWay subWay)
    {
        this.subWay=subWay;
    }
    @Override
    public int getPrice() {
        if(subWay==null)
        {
            return 25;
        }
        return subWay.getPrice()+25;
    }

    @Override
    public String getDescription() {
        if(subWay==null)
        {
            return "Wheat Bread";
        }
        return subWay.getDescription()+"Wheat Bread +";
    }
}
