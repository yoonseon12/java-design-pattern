package observer.example;

public abstract class Subscriber {
    public void follow(Youtuber youtuber) {
        youtuber.addSubscriber(this);
    };

    public void unFollow(Youtuber youtuber) {
        youtuber.removeSubscriber(this);
    };

    public void alert(String msg) {
        System.out.println("알림 : " + msg);
    };
}
