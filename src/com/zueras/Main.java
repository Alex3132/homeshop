package com.zueras;

import com.zueras.homeshop.*;
import com.zueras.paris.Bus;
import com.zueras.paris.MoyenDeLocomotion;
import com.zueras.paris.Parisien;
import com.zueras.paris.Taxi;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante, Noir - 1 ou 2 tasses", 79.99);
        Television tv = new Television("TV Samsung UE49MU6292", "Smart TV LED incurvée\"", 599, 49, "LED");
        Fridge fridge = new Fridge("BEKO TSE 1042 F", "Réfrigérateur BEKO 130L - Classe A+ - blanc", 189, 130, false);

        Customer customer = new Customer("Juste Leblanc", "2, rue de la trefle, Toulouse");

        Bill bill = new Bill(customer);
        bill.addProduct(cafe, 1);
        bill.addProduct(tv, 1);
        bill.addProduct(fridge, 1);
        */

        Parisien segolene = new Parisien();
        Bus bus = new Bus();
        segolene.seDeplacer(bus);
        Taxi taxi = new Taxi();
        segolene.seDeplacer(taxi);

        MoyenDeLocomotion taxi2 = new Taxi();
        segolene.seDeplacer(taxi2);




    }
}
