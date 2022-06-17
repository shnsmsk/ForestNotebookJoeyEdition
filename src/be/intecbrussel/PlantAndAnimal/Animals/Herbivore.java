package be.intecbrussel.PlantAndAnimal.Animals;

import be.intecbrussel.PlantAndAnimal.Plant.Plant;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet= new HashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length,int decibel) {
        super(name, weight, height, length,decibel);
    }
    public void addPlantToDiet(Plant plant){
        plantDiet.add(plant);
    }
    public void printDiet(){
        plantDiet.forEach(System.out::println);
        }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "name=" + getName()+
                ", plantDiet=" + plantDiet +
                ", decibel="+ getDecibel()+
                '}';
    }
    public void makeNoise() {
        System.out.println(getName()+" is making "+getDecibel()+" decibel noise.");
    }
}

