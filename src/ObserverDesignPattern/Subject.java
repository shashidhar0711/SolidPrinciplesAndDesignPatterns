package ObserverDesignPattern;

public interface Subject {
    void RegisterSubscriber(Observers ob);
    void RemoveSubscriber(Observers ob);
    void notifyObserver();

}
