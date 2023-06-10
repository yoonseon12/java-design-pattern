package adapter;

public class PersonAdepter implements Student{
    private Person person;

    public PersonAdepter(Person person) {
        this.person = person;
    }

    @Override
    public String showName() {
        return person.getName();
    }

    @Override
    public int showAge() {
        return person.getAge();
    }
}
