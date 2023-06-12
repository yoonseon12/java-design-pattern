package observer.example;

import java.util.ArrayList;
import java.util.List;

public class Tzuyoung implements Youtuber {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void upload(String title) {
        subscribers.forEach(subscriber -> subscriber.alert("쯔양님의 새로운 소식이 있습니다. [" + title + "]"));
    }
}
