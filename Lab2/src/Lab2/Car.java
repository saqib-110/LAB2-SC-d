package Lab2;
class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getDetails() {
        return year + " " + make + " " + model;
    }
}