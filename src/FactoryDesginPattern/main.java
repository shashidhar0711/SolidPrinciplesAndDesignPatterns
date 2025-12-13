package FactoryDesginPattern;

import FactoryDesginPattern.Component.Button.Button;

public class main {
    static void main(String[] args) {
        Platform p = new Ios();
        UiComponentFactory androidFactory = p.getFactory();
        Button button = androidFactory.CreateButton();
        button.click();

        // practical factory design pattern
        Platform p1 = new Platform();
        UiComponentFactory fac = p1.getFactory("Ios");
        Button b = fac.CreateButton();
        b.click();
    }
}
