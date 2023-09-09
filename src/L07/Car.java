package L07;

import java.util.ArrayList;

public class Car {
    //required parameters
    private int yearModel;
    private String brand;
    private int numberModel;
    private Engine engine;

    //optional parameters
    private int priceModel;


    public Car(CarBuilder builder) {
        this.yearModel = builder.yearModel;
        this.brand = builder.brand;
        this.numberModel = builder.numberModel;
        this.priceModel = builder.priceModel;
    }


    public int getYear() {
        return yearModel;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return priceModel;
    }

    public int getNumber() {
        return numberModel;
    }

    static class CarBuilder {
        //required parameters
        private int yearModel;
        private String brand;
        private int numberModel;
        private Engine engine;

        //optional parameters
        private int priceModel;

        public CarBuilder(int yearModel, String brand, int numberModel, Engine engine) {
            this.yearModel = yearModel;
            this.brand = brand;
            this.numberModel = numberModel;
        }

        public CarBuilder setPriceModel(int priceModel) {
            this.priceModel = priceModel;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}

class Engine {


}

class TestCar {

    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder(2012, "Audi", 3, new Engine());

        Car car = new Car.CarBuilder(2012, "Audi", 3, new Engine()).setPriceModel(150000).build();
    }
}
