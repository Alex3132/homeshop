package com.zueras.paris;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String adrese) {
        System.out.println("Je suis un taxi et je vais à l'adresse "+ adrese);
    }
}
