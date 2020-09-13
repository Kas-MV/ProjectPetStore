package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetStore {

    public Animal dog = new Dog("Рэкс", 4, 600);
    public Animal cat = new Cat("Мурзик", 2, 450);

    public PetStore() {
        System.out.println("Добро пожаловать в наш зоомагазин 'Верный Друг'");
        System.out.println("У нас есть кошечки и собачки =)");
    }

    public Animal getAnimal(AnimalType type) {
        switch (type) {
            case CAT:
                return cat;
            case DOG:
                return dog;
            default:
                throw new RuntimeException("wrong type of animal");

        }
    }

    public boolean sell (Man man, Animal pet) {
        if (man.getMoney() > pet.getPrice()) {
            System.out.println("У Вас хватает денег на покупку питомца! =) и Вы можете купить " + pet);
            if (pet instanceof Cat){
                this.cat = null;
            }else {
                this.dog = null;
            }
            man.setPet(pet);
        }else {
            System.out.println("Увы, у Вас не хватает денег на питомца =( " + pet );
        }

        return false;
    }

}
