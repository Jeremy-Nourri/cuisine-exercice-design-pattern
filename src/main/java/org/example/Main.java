package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        CuisineFactory cuisineItalienne = new ItalianCuisineFactory();

        Restaurant restaurant = new Restaurant(cuisineItalienne);

        restaurant.prepareMeals();

    }
}