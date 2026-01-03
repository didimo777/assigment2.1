public class Bus extends Vehicle {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double calculateInsuranceFee() {
        int age = getAge(2025);
        return basePrice * 0.08 + passengerCapacity * 10 + age * 150;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", capacity=" + passengerCapacity;
    }
}
