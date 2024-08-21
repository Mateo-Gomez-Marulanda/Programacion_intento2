package com.example.Builder.taller2;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();

        Car sedan = builder.setEngine("V6").setTransmission("Automatic").setWheels(4).setColor("Red")
                .setAirConditioning(true).build();

        Car spotrsCar = builder.setEngine("V8").setTransmission("Manual").setWheels(4).setColor("Blue")
                .setAirConditioning(false).build();

        Car suv = builder.setEngine("V6").setTransmission("Automatic").setWheels(4).setColor("Black")
                .setAirConditioning(true).build();

        System.out.println(sedan.toString());
        System.out.println(spotrsCar.toString());
        System.out.println(suv.toString());
    }
}
