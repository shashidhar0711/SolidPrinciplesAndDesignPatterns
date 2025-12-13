package FactoryDesginPattern;

public class Platform {
    void setTheme() {

    }
    public UiComponentFactory getFactory() {
        return null;
    }

    public UiComponentFactory getFactory(String platform) {
        return UiDecideFactory.decideFactory(platform);
    }
}
