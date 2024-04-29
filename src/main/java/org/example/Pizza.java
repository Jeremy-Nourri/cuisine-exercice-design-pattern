package org.example;

import java.util.List;

public class Pizza {
    private String taille;
    private String typeDePate;
    private String fromage;
    private List<String> listeDeGarnitures;
    private String typeDeSauce;
    private Pizza (PizzaBuilder builder) {
        this.taille = builder.taille;
        this.typeDePate = builder.typeDePate;
        this.fromage = builder.fromage;
        this.listeDeGarnitures = builder.listeDeGarnitures;
        this.typeDeSauce = builder.typeDeSauce;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "taille='" + taille + '\'' +
                ", typeDePate='" + typeDePate + '\'' +
                ", fromage='" + fromage + '\'' +
                ", listeDeGarnitures=" + listeDeGarnitures +
                ", typeDeSauce='" + typeDeSauce + '\'' +
                '}';
    }
    static class PizzaBuilder {
        private String taille;
        private String typeDePate;
        private String fromage;
        private List<String> listeDeGarnitures;
        private String typeDeSauce;

        public PizzaBuilder setTaille (String taille) {
            this.taille = taille;
            return this;
        }
        public PizzaBuilder setTypeDePate(String typeDePate) {
            this.typeDePate = typeDePate;
            return this;
        }
        public PizzaBuilder setFromage (String fromage) {
            this.fromage = fromage;
            return this;
        }
        public PizzaBuilder setListeDeGarnitures (List<String> listeDeGarnitures) {
            this.listeDeGarnitures = listeDeGarnitures;
            return this;
        }
        public PizzaBuilder setTypeDeSauce (String typeDeSauce) {
            this.typeDeSauce = typeDeSauce;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
