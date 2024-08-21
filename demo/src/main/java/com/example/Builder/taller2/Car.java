package com.example.Builder.taller2;

public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airConditioning;

    public Car(String engine, String transmission, int wheels, String color, boolean airConditioning) {
        this.engine = engine;
        this.transmission = transmission;
        this.wheels = wheels;
        this.color = color;
        this.airConditioning = airConditioning;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColor() {
        return color;
    }

    public boolean hasAirConditioning() {
        return airConditioning;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAirConditioning(boolean airConditioning) {
        this.airConditioning = airConditioning;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", transmission=" + transmission + ", wheels=" + wheels
                +
                ", color=" + color + ", airConditioning=" + airConditioning + "]";
    }
}
