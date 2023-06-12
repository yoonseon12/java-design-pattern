package observer.example;

public class Lee extends Subscriber {
    @Override
    public void alert(String msg) {
        System.out.println("Lee 알림 : " + msg);
    }
}
