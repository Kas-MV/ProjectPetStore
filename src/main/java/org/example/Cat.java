package org.example;

public class Cat extends Animal {

    public Cat(String name, int age, double price) {
        super(name, age, price);

    }


//    public void voiсe(byte catFood) {
//
//    }

    public void voice() {
        System.out.println("Myaaaayyyyuuu");
    }

    public void voice(byte catFood) {
        if (catFood < 2) {
            voice();
        } else {
            System.out.println(".................");
        }
    }

    @Override
    public String toString() {
        return "Котейку {" +
                "кличка = '" + name + '\'' +
                ", возраст = " + age +
                ", цена = " + price +
                '}';
    }
}
