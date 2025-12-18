package ObserverDesignPattern;

public class currentDisplay implements Observers, Display{

    private float temperature;
    private float humidity;
    private Subject subject;

    currentDisplay(Subject subject) {
        this.subject = subject;
        subject.RegisterSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println("The Current Temperature is: "+temperature +", Current Humidity is: "+humidity);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
