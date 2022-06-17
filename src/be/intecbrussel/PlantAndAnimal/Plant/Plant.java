package be.intecbrussel.PlantAndAnimal.Plant;

import java.util.Objects;

public class Plant {
    private String name;
    private double height;
    private Colour colour;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, double height,Colour colour) {
        this.name = name;
        this.height = height;
        this.colour=colour;
    }

    public String getName() {
        return name;
    }


    public double getHeight() {
        return height;
    }


    public Colour getColour() {
        return colour;
    }


    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", colour=" + colour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.getHeight(), getHeight()) == 0 && Objects.equals(getName(), plant.getName());
    }
}
