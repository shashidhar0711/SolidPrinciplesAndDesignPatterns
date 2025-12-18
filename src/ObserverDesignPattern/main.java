package ObserverDesignPattern;

public class main {
    static void main(String[] args) {
        weatherData wdata = new weatherData();
        currentDisplay cdisplay = new currentDisplay(wdata);
        avgDisplay adisplay = new avgDisplay(wdata);

        wdata.setMeasurements(12, 10);
        wdata.setMeasurements(11, 24);

        wdata.RemoveSubscriber(adisplay);

        wdata.setMeasurements(100, 100);

    }
}
