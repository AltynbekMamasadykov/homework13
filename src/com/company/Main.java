package com.company;

public class Main {

    public static void main(String[] args) {
	Cat cat = new Cat();
    cat.setName("Tom");
    cat.setAge(4);
    cat.setColor("black");
    cat.getInfo();

    Dog dog = new Dog();
    dog.setName("Aktosh");
    dog.setAge(3);
    dog.setColor("white");
    dog.getInfo();

    Fish fish = new Fish();
    fish.setName("Nemo");
    fish.setAge(1);
    fish.setColor("red");
    fish.getInfo();

    Parrot parrot = new Parrot();
    parrot.setName("Popugai");
    parrot.setAge(2);
    parrot.setColor("yellow");
    parrot.getInfo();




    }
}
