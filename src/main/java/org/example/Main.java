package org.example;

public class Main {
    public static void main(String[] args) {

        PetStore shop = new PetStore();
        Man man = new Man("Джонни", 25, 500);


            if (shop.sell(man, shop.getAnimal(AnimalType.DOG))){
                System.out.println(man.getPet());

            } else if (shop.sell(man, shop.getAnimal(AnimalType.CAT))){
                System.out.println(man.getPet());
            }
        }
    }
