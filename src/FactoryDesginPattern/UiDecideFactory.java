package FactoryDesginPattern;

public class UiDecideFactory {
    public static UiComponentFactory decideFactory(String platform) {
        // Here, calling the factory object via parameter,
        // so called practical fractory dp
        if (platform.equals("Android")) {
            return new AndroidComponentFactory();
        } else if (platform.equals("Ios")) {
            return new IosComponentFactory();
        } else {
            return null;
        }
    }
}
