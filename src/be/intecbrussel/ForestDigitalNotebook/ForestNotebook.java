package be.intecbrussel.ForestDigitalNotebook;

import be.intecbrussel.PlantAndAnimal.Animals.Animal;
import be.intecbrussel.PlantAndAnimal.Animals.Carnivore;
import be.intecbrussel.PlantAndAnimal.Animals.Herbivore;
import be.intecbrussel.PlantAndAnimal.Animals.Omnivore;
import be.intecbrussel.PlantAndAnimal.Plant.Plant;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNotebook {
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();
    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount;
    private int animalCount;

    public List<Carnivore> getCarnivores() {
        return carnivores.stream().toList();
    }

    public List<Omnivore> getOmnivores() {
        return omnivores.stream().toList();
    }

    public List<Herbivore> getHerbivores() {
        return herbivores.stream().toList();
    }

    public int getPlantCount() {
        System.out.println("Plant count : ");
        return plantCount;
    }

    public int getAnimalCount() {
        System.out.println("Animal count : ");
        return animalCount;
    }

    public void printNotebook() {
        System.out.println("*".repeat(80));
        System.out.println("Plants");
        plants.forEach(System.out::println);
        System.out.println("*".repeat(80));
        System.out.println("Animals");
        animals.forEach(System.out::println);
        /*System.out.println("Omnivores");
        omnivores.forEach(System.out::println);
        System.out.println("*".repeat(80));
        System.out.println("Herbivores");
        herbivores.forEach(System.out::println);
        System.out.println("*".repeat(80));
        System.out.println("Carnivores");
        carnivores.forEach(System.out::println);
        System.out.println("*".repeat(80));
         */

    }

    public void addAnimal(Animal animal) {
        if (!animals.contains(animal)) {
            animals.add(animal);
            animalCount++;
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            } else if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            } else {
                omnivores.add((Omnivore) animal);
            }
        }
    }

    public void addPlant(Plant plant) {
        if (!plants.contains(plant)) {
            plants.add(plant);
            plantCount++;
        }
    }

    public void sortAnimalsByName() {
        animals = animals.stream()
                .sorted(Comparator.comparing(Animal::getName))
                .collect(Collectors.toList());
    }

    public void sortPlantsByName() {
        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getName))
                .collect(Collectors.toList());
    }

    public void sortPlantsByColour() {//Sorting via the natural order of the enum
        plants = plants.stream()
                .sorted(Comparator.comparing(Plant::getColour))
                .collect(Collectors.toList());
    }

    public void sortAnimalByDecibel() {
        animals.stream()
                .filter(a -> a.getDecibel() > 50)
                .sorted(Comparator.comparing(Animal::getDecibel))
                .sorted(Comparator.comparingInt(Animal::getDecibel).reversed()).toList()
                .forEach(System.out::println);
    }

}
