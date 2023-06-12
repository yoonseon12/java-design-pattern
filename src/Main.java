import adapter.Person;
import adapter.PersonAdepter;
import builder.Text;
import command.DrawingApp;
import decorator.FullBorder;
import decorator.Scaffold;
import decorator.SideBorder;
import decorator.TextWidget;
import factory.Factory;
import factory.IDCard;
import factory.IDCardFactory;
import factory.Product;
import observer.DigitObserver;
import observer.GraphicObserver;
import observer.Observer;
import observer.RandomGenerator;
import observer.example.Kim;
import observer.example.Lee;
import observer.example.Pack;
import observer.example.Tzuyoung;
import singleton.Singleton;
import strategy.*;

public class Main {
    public static void main(String[] args) {
//        builder();
//        factoryMethod();
//        none_singleton();
//        singleton();
//        adapter();
//        decorator();
//        command();
//        memento();
//        observer();
//        observerExample();
        strategy();
    }

    public static void builder() {
        Text text = new Text.Builder()
                .setTitle("hello")
                .setContent("내용")
                .setItems("항목1", "항목2", "항목3")
                .build();
        System.out.println(text);
    }

    public static void factoryMethod() {
        Factory factory = new IDCardFactory();
        Product idCard1 = factory.createProduct("홍길동");
        Product idCard2 = factory.createProduct("한석봉");

        idCard1.use();
        idCard2.use();

        IDCard idCard3 = IDCard.Factory.create("한석봉");
        idCard3.use();
    }

    public static void none_singleton() {
        String singleton1 = new String("test");
        String singleton2 = new String("test");

        if (singleton1 == singleton2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }

    public static void singleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같음");
        } else {
            System.out.println("다름");
        }
    }

    public static void adapter() {
        Person person = new Person("홍길동", 30);
        PersonAdepter personAdepter = new PersonAdepter(person);

        System.out.println(personAdepter.showName()); // 홍길동
        System.out.println(personAdepter.showAge()); // 30
    }

    public static void decorator() {
        new Scaffold(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new TextWidget("decorator pattern")
                                        )
                                )
                        )
                )
        );
    }

    public static void command() {
        new DrawingApp("Command");
    }

    public static void memento() {
        new DrawingApp("Memento");
    }

    public static void observer() {
        RandomGenerator randomGenerator = new RandomGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphicObserver();
        Observer observer3 = number -> {
            for (int i = 0; i < number; i++) {
                System.out.print("=");
            }
            System.out.println();
        };

        randomGenerator.addObserver(observer1);
        randomGenerator.addObserver(observer2);
        randomGenerator.addObserver(observer3);
        randomGenerator.execute();

        randomGenerator.removeObserver(observer2);
        randomGenerator.execute();
    }

    public static void observerExample() {
        Tzuyoung tzuyoung = new Tzuyoung();

        Kim kim = new Kim();
        Lee lee = new Lee();
        Pack pack = new Pack();

        kim.follow(tzuyoung);
        lee.follow(tzuyoung);
        pack.follow(tzuyoung);

        tzuyoung.upload("첫 번째 동영상");

        kim.unFollow(tzuyoung);

        tzuyoung.upload("두 번째 동영상");

    }

    public static void strategy() {
        Player player1 = new Player("player1", new RockStrategy());
        Player player2 = new Player("player2", new PaperStrategy());
        Player player3 = new Player("player3", new RandomStrategy());
        Player player4 = new Player("player4", () -> Hand.Scissors);

        System.out.println(player1.nextHand().fight(player2.nextHand()));

        for (int i = 0; i < 10; i++) {
            System.out.println(player1.nextHand().fight(player3.nextHand()));
        }

        System.out.println(player1.nextHand().fight(player4.nextHand()));
    }
}
