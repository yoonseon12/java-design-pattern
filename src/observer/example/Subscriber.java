package observer.example;

public abstract class Subscriber {
    public void follow(Youtuber youtuber) {
        youtuber.addSubscriber(this);
    };

    public void unFollow(Youtuber youtuber) {
        youtuber.removeSubscriber(this);
    };

    public abstract void alert(String msg);
}
