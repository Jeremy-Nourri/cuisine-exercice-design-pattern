package org.example;

public abstract class CuisineFactory {
    public abstract Ingredient createIngredient();

    public abstract CookingUstensil createUstensil();

    public abstract Dish createDish();

}
