public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car1 = new Car("red", "BMW", 5);
        Car car2 = new Car("blue", "Audi", 3);
        Car car3 = new Car("Green", "Porsche", 3);
//Ich ändere hier Files so wie ich will
        factory.buildCar(car1);
        factory.buildCar(car2);
    }
}

