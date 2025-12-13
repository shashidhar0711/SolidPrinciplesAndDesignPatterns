package FactoryDesginPattern;

import FactoryDesginPattern.Component.Button.AndroidButton;
import FactoryDesginPattern.Component.Button.Button;
import FactoryDesginPattern.Component.Menu.AndroidMenu;
import FactoryDesginPattern.Component.Menu.Menu;

public class AndroidComponentFactory implements UiComponentFactory{
    @Override
    public Button CreateButton() {
        return new AndroidButton();
    }

    @Override
    public Menu CreateMenu() {
        return new AndroidMenu();
    }

}
