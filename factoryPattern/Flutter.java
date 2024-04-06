package org.example.factoryPattern;

public class Flutter {
    public void refresh()
    {
        System.out.println("refreshed the page");
    }

    public void setTheme()
    {
        System.out.println("Set the default theme");
    }


    //This is a factory method which helps to get the factory object of corresponding factory object
    public UIFactory getUIFactoryObject(SupportedPlatform platform)
    {
        /*
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
        */
        return UIFactoryHelper.getUIFactoryObject(platform);
    }
}
