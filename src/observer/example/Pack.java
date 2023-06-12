package observer.example;

public class Pack extends Subscriber {
    @Override
    public void alert(String msg) {
        System.out.println("Pack 알림 : " + msg);
    }
}
