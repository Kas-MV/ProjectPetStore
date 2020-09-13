package org.example;

import lombok.ToString;

@ToString
public class Dog extends Animal {

    public Dog(String name, int age, double price) {
        super(name, age, price);
    }


//    public void voiсe(byte dogFood) {
//
//    }

    public void voice() {
        System.out.println("Rrrrrrrafffffffff");
    }

    public void voice(byte dogFood) {
        if (dogFood < 5) {
            voice();
        } else {
            System.out.println(".................");
        }
    }

    @Override
    public String toString() {
        return "Собакена {" +
                "кличка = '" + name + '\'' +
                ", возраст = " + age +
                ", цена = " + price +
                '}';
    }
}
