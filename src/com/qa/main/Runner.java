package com.qa.main;

public class Runner {

    public static void main(String[] args) {

        Car tesla = new Car("black", "cybertruck", 1000, 4, 5, 2000);
        RacingDriver lewisHamilton = new RacingDriver();

        lewisHamilton.setMilesDriven(500);
        lewisHamilton.drive(tesla);

        System.out.println(tesla.getMileage());
        
        Mechanic bob = new Mechanic();
        bob.setFlatLabourCost(250);
        System.out.println(bob.fixCar(tesla));;

    }

}
