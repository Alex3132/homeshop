package com.zueras.paris;

public class Bus implements MoyenDeLocomotion {
    @Override
    public void deplace(String adrese) {
        System.out.println("Je suis un bus et je vais à l'adresse "+ adrese);
    }
}
