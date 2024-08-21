package com.example.Builder.taller2;

public class CarBuilder {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean airConditioning;

    public CarBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setWheels(int wheels){
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }

    public CarBuilder setAirConditioning(boolean airConditioning){
        this.airConditioning = airConditioning;
        return this;
    }

    public Car build(){
        return new Car(this.engine, this.transmission,this.wheels, this.color, this.airConditioning);
    }
}
