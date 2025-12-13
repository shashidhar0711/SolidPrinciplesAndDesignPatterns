package FactoryDesginPattern.Component.Menu;

public class IosMenu implements Menu{
    @Override
    public void expandMenu() {
        System.out.println("Expanding the ios menu");
    }
}
