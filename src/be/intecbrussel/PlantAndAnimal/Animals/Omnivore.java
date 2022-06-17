package be.intecbrussel.PlantAndAnimal.Animals;

import be.intecbrussel.PlantAndAnimal.Plant.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal{
    private Set<Plant> plantDiet=new HashSet<>();
    private double maxFoodSize;

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length, int decibel) {
        super(name, weight, height, length, decibel);
    }

    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "name=" + getName()+
                ", plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                ", decibel="+ getDecibel()+
                '}';
    }

    public double getMaxFoodSize() {
        maxFoodSize=getHeight();
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public void makeNoise() {
        System.out.println(getName()+" is making "+getDecibel()+" decibel noise.");
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }
}
