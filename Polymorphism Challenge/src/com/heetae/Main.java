package com.heetae;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car -> Starting the engine...";
    }

    public String accelerate() {
        return "Car -> Accelerating...";
    }

    public String brake() {
        return "Car -> Break. Slowing down the car...";
    }
}

class BMW extends Car {
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "BMW -> accelerate()";
    }

    @Override
    public String brake() {
        return "BMW -> brake()";
    }
}

class Hyundai extends Car {
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }
}

class KIA extends Car {
    public KIA(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "KIA -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "KIA -> accelerate()";
    }

    @Override
    public String brake() {
        return "KIA -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW("328i", 6);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());

        KIA kia = new KIA("Forte", 6);
        System.out.println(kia.startEngine());
        System.out.println(kia.accelerate());
        System.out.println(kia.brake());

        Hyundai hyundai = new Hyundai("Avante", 4);
        System.out.println(hyundai.startEngine());
        System.out.println(hyundai.accelerate());
        System.out.println(hyundai.brake());

    }


}
