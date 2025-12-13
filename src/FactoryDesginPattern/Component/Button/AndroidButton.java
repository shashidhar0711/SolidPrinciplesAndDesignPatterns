package FactoryDesginPattern.Component.Button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Clicking the android button");
    }
}
