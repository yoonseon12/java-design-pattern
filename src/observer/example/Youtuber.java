package observer.example;

public interface Youtuber {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void upload(String text);
}
