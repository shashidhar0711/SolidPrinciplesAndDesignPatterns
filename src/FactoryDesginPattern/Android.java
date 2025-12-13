package FactoryDesginPattern;

public class Android extends Platform{

    public void setTheme() {

    }

    public UiComponentFactory getFactory() {
        // This class is rely on the other class and getting the object is the factory pattern
        return new AndroidComponentFactory();
    }
}
