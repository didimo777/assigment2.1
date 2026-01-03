public class Car extends Vehicle {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2025);
        return basePrice * 0.05 + age * 100;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", doors=" + numberOfDoors;
    }
}
