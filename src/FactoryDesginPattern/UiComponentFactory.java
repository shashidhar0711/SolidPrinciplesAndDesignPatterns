package FactoryDesginPattern;

import FactoryDesginPattern.Component.Button.Button;
import FactoryDesginPattern.Component.Menu.Menu;

public interface UiComponentFactory {
    Button CreateButton();
    Menu CreateMenu();
}
