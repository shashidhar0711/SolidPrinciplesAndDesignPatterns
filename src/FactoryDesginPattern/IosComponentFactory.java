package FactoryDesginPattern;

import FactoryDesginPattern.Component.Button.Button;
import FactoryDesginPattern.Component.Button.IosButton;
import FactoryDesginPattern.Component.Menu.IosMenu;
import FactoryDesginPattern.Component.Menu.Menu;

public class IosComponentFactory implements UiComponentFactory {

    public Button CreateButton() {
        return new IosButton();
    }

    public Menu CreateMenu() {
        return new IosMenu();
    }

}
