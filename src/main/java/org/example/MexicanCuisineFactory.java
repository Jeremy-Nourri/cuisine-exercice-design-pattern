package org.example;

public class MexicanCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new MexicanIngredient();
    }

    @Override
    public CookingUstensil createUstensil() {
        return new MexicanUstensil();
    }

    @Override
    public Dish createDish() {
        return new MexicanDish();
    }
}
