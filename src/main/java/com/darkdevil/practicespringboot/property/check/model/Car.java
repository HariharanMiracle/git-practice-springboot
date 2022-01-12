package com.darkdevil.practicespringboot.property.check.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Value("${car.name}")
    private String vehicleNumber;

    @Value("${car.brand}")
    private String brand;

    @Value("${car.vehicle.number}")
    private String name;

    public Car() {
    }

    public Car(String vehicleNumber, String brand, String name) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.name = name;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehicleNumber='" + vehicleNumber + '\'' +
                ", brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
