package org.example.factoryPattern;

public  class UIFactoryHelper {
    public static UIFactory getUIFactoryObject(SupportedPlatform platform)
    {
        //here in the primary class we have many if else conditions , so we take help of helper object
        if(platform.equals(SupportedPlatform.Android))
        {
            return new AndroidUIFactory();
        }
        else if(platform.equals(SupportedPlatform.IOS))
        {
            return new IOSUIFactory();
        }
        else if(platform.equals(SupportedPlatform.Windows))
        {
            return null;
        }
        else
        {
            return null;
        }
    }
}
