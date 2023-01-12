package transport;

import enumPackage.PassengerCapacityType;
import enumPackage.TypeTransport;
import exeption.DiagnosisIsNotPossibleExeption;
import driver.DriverD;
import enumPackage.DriverLicenseType;

public class Bus extends Transport<DriverD> implements ICompeting {

    private PassengerCapacityType passengerCapacityType;

    public Bus(String brand, String model, float volumeEngine, DriverD driver, DriverLicenseType requiredTypeDriverLicense, TypeTransport typeTransport) {
        super(brand, model, volumeEngine, driver, requiredTypeDriverLicense, typeTransport);
    }

    @Override
    public void getType() {
        if(passengerCapacityType == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println(passengerCapacityType);
        }
    }

    @Override
    public void doDiagnosed() {
        Exception e = new DiagnosisIsNotPossibleExeption("Этот транспорт не может пройти диагностику");
        System.out.println(this + " " + e.getMessage());
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

    public PassengerCapacityType getPassengerCapacityType() {
        return passengerCapacityType;
    }

    public void setPassengerCapacityType(PassengerCapacityType passengerCapacityType) {
        this.passengerCapacityType = passengerCapacityType;
    }

    @Override
    public String toString() {
        return "Автобус:" +
                "\nБренд: " + brand  +
                ", Модель: " + model;
    }
}
