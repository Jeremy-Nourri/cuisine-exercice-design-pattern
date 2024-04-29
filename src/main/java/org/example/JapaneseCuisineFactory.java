package org.example;

public class JapaneseCuisineFactory extends CuisineFactory {
    @Override
    public Ingredient createIngredient() {
        return new JapaneseIngredient();
    }
    @Override
    public CookingUstensil createUstensil() {
        return new JapaneseUstensil();
    }
    @Override
    public Dish createDish() {
        return new JapaneseDish();
    }
}
