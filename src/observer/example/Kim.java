package observer.example;

public class Kim extends Subscriber {
    @Override
    public void alert(String msg) {
        System.out.println("Kim 알림 : " + msg);
    }
}
