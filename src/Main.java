public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota Camry", 2018, 20000, 4);
        Vehicle bus = new Bus("Mercedes Bus", 2015, 50000, 50);

        System.out.println(car);
        System.out.println("Insurance fee: " + car.calculateInsuranceFee());

        System.out.println();

        System.out.println(bus);
        System.out.println("Insurance fee: " + bus.calculateInsuranceFee());
    }
}
