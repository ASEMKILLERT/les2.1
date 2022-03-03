package com.company;

import java.util.Random;

public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    private int generateDefaultAge(){
        Random random = new Random();
        return  random.nextInt(10) + 1;
    }
    public String getInfo (){
        return "Age" + age
                + "\nColor" + color +
                "\nShelter Address: " + shelter.getAddress() +
                "\nShelter Name: " + shelter.getName();
    }

}
