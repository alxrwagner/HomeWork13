package transport;

import driver.DriverD;

import java.sql.Driver;

public class Bus extends Transport<DriverD> implements ICompeting {

    public Bus(String brand, String model, float volumeEngine, DriverD driver) {
        super(brand, model, volumeEngine, driver);
    }

    @Override
    public void pitStop() {
        System.out.println("Я - школьный автобус, мне такое не надо");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Какой еще круг?");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Я опять кого-то сбил... О_о");
    }

    @Override
    public String toString() {
        return "Я - автобус, мой бренд: " + brand  +
                ", модель: " + model +
                ", а объем двигателя: " + volumeEngine;
    }
}
