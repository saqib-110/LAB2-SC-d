package Lab2;
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 2022);
        Person person = new Person("Rohan", 20, car);

        person.showDetails();
    }
}
