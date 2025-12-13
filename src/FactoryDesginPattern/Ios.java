package FactoryDesginPattern;

public class Ios extends Platform{

    public void setTheme() {

    }

    public UiComponentFactory getFactory() {
        // factory dp
        return new IosComponentFactory();
    }
}
