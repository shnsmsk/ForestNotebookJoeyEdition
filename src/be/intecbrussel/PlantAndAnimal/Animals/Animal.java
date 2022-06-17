package be.intecbrussel.PlantAndAnimal.Animals;

import java.util.Objects;

public class Animal {
    private String name;
    private double weight;
    private double height;
    private double length;
    private int decibel;
    private String sound;
    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, double weight, double height, double length,int decibel) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.decibel=decibel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.getWeight(), getWeight()) == 0 && Double.compare(animal.getHeight(), getHeight()) == 0 && Double.compare(animal.getLength(), getLength()) == 0 && Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public void makeNoise() {
        System.out.println("making noise...");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                ", decibel=" + decibel +
                ", sound='" + sound + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public int getDecibel() {
        return decibel;
    }

    public String getSound() {
        return sound;
    }

}
