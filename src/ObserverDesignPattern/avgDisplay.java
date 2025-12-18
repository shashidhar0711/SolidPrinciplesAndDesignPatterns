package ObserverDesignPattern;

public class avgDisplay implements Observers, Display{
    private float temperature;
    private float humidity;
    private Subject subject;

    avgDisplay(Subject subject) {
        this.subject = subject;
        subject.RegisterSubscriber(this);
    }

    @Override
    public void display() {
        System.out.println("The Average Temperature is: "+temperature +", Average Humidity is: "+humidity);
    }

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void deRegister() {
        this.subject.RemoveSubscriber(this);
    }
}
