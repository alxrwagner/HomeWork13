package transport;

import driver.DriverC;

public class Track extends Transport<DriverC> implements ICompeting {

    public Track(String brand, String model, float volumeEngine, DriverC driver) {
        super(brand, model, volumeEngine, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Я знаю что такое пит-стоп, но не скажу");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Мое лучшее время круга лучше всех!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Я быстрее вон тех двоих");
    }

    @Override
    public String toString() {
        return "Я - грузовой автомобиль, мой бренд: " + brand  +
                ", модель: " + model +
                ", а объем двигателя: " + volumeEngine;
    }
}
