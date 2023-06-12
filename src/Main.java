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
import singleton.Singleton;

public class Main {
    public static void main(String[] args) {
//        builder();
//        factoryMethod();
//        none_singleton();
//        singleton();
//        adapter();
//        decorator();
//        command();
        memento();
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
}
