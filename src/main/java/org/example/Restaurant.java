package org.example;

public class Restaurant {
    private Dish dish;
    private Ingredient ingredient;
    private CookingUstensil ustensil;

    public Restaurant (CuisineFactory factory) {
        dish = factory.createDish();
        ingredient = factory.createIngredient();
        ustensil = factory.createUstensil();
    }

    public void prepareMeals() {
        ingredient.prepare();
        dish.serve();
        ustensil.use();
    }
}
