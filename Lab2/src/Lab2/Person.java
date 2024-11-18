package Lab2;

class Person {
    private String name;
    private int age;
    private Car car;

    public Person(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (car != null) {
            System.out.println("Car: " + car.getDetails());
        } else {
            System.out.println("Car: None");
        }
    }
}

