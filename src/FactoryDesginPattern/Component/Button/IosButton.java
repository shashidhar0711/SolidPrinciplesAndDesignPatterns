package FactoryDesginPattern.Component.Button;

public class IosButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicking Ios button");
    }
}
