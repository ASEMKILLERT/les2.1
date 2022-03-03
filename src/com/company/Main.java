package com.company;

public class Main {

    public static void main(String[] args) {
	Shelter shelter = new Shelter("Romashka", "Pervomayskaya 1");
    Dog dog = new Dog("Rex", "Ovcharka", new String[]{"Сидеть, Лежать"}, shelter,Color.BROWN);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("Гув Гув");
    }
}
