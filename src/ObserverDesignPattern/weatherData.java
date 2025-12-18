package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class weatherData implements Subject{

    private float temperature;
    private float humidity;

    List<Observers> observersList = new ArrayList<>();
    @Override
    public void RegisterSubscriber(Observers ob) {
        observersList.add(ob);
        System.out.println("Observers are added!");
    }

    @Override
    public void RemoveSubscriber(Observers ob) {
        observersList.remove(ob);
        System.out.println("Observers are removed");
    }

    @Override
    public void notifyObserver() {
        for (Observers o: observersList){
            o.update(temperature, humidity);
        }
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}
