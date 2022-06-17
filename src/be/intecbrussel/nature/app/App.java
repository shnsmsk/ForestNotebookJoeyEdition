package be.intecbrussel.nature.app;

import be.intecbrussel.ForestDigitalNotebook.ForestNotebook;
import be.intecbrussel.PlantAndAnimal.Animals.Animal;
import be.intecbrussel.PlantAndAnimal.Animals.Carnivore;
import be.intecbrussel.PlantAndAnimal.Animals.Herbivore;
import be.intecbrussel.PlantAndAnimal.Animals.Omnivore;
import be.intecbrussel.PlantAndAnimal.Plant.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Tree plant1=new Tree("x",100,Colour.BLUE);
        plant1.setLeafType(LeafType.NEEDLE);
        Flower plant2=new Flower("xy",99,Colour.BROWN);
        plant2.setSmell(Scent.ORANGE);
        Bush plant3=new Bush("xyz",98,Colour.GREEN);
        plant3.setLeafType(LeafType.HAND);
        plant3.setFruit("apple");
        Tree plant4=new Tree("xxx",97,Colour.YELLOW);
        plant4.setLeafType(LeafType.HEART);
        Flower plant5=new Flower("xzz",10,Colour.RED);
        plant5.setSmell(Scent.EARTHY);
        Tree plant6=new Tree("x",100,Colour.BROWN);
        plant6.setLeafType(LeafType.SPEAR);
        Bush plant7=new Bush("xyz",98,Colour.BLUE);
        plant7.setLeafType(LeafType.HAND);
        Animal animal1=new Carnivore("lion",100,180,220,1905);
        ((Carnivore) animal1).setMaxFoodSize(plant5.getHeight());
        Animal animal2=new Herbivore("bird",2,29,29,30);
        ((Herbivore) animal2).addPlantToDiet(plant1);
        Animal animal3=new Herbivore("deer",40,180,220,55);
        ((Herbivore) animal3).addPlantToDiet(plant2);
        Animal animal4=new Omnivore("xy",100,3,12,29);
        ((Omnivore) animal4).addPlantToDiet(plant4);
        ((Omnivore) animal4).setMaxFoodSize(plant1.getHeight());
        Animal animal5=new Carnivore("tiger",100,170,230,51);
        ((Carnivore) animal5).setMaxFoodSize(plant6.getHeight());
        Animal animal6=new Carnivore("lionffg",100,180,220,120);
        ((Carnivore) animal6).setMaxFoodSize(plant6.getHeight());
        Animal animal7=new Herbivore("birdwer",2,29,29,90);
        ((Herbivore) animal7).addPlantToDiet(plant3);
        Animal animal8=new Herbivore("deerqww",40,180,220,121);
        ((Herbivore) animal8).addPlantToDiet(plant3);
        Animal animal9=new Omnivore("xyyy",100,3,12,150);
        ((Omnivore) animal9).setMaxFoodSize(plant3.getHeight());
        Animal animal10=new Carnivore("lionffg",100,180,220,1907);
        Animal animal11=new Omnivore("xyyy",100,3,12,122);
        ((Omnivore) animal11).setMaxFoodSize(plant3.getHeight());
        Animal animal12=new Omnivore("xyyy",100,3,12,58);
        ((Omnivore) animal12).setMaxFoodSize(plant3.getHeight());
        Animal animal13=new Herbivore("birdwer",2,29,29,97);
        ((Herbivore) animal13).addPlantToDiet(plant3);
        ForestNotebook forestNotebook=new ForestNotebook();
        forestNotebook.addAnimal(animal1);
        forestNotebook.addAnimal(animal2);
        forestNotebook.addAnimal(animal3);
        forestNotebook.addAnimal(animal4);
        forestNotebook.addAnimal(animal5);
        forestNotebook.addAnimal(animal6);
        forestNotebook.addAnimal(animal7);
        forestNotebook.addAnimal(animal8);
        forestNotebook.addAnimal(animal9);
        forestNotebook.addAnimal(animal10);//trying to add same animal
        forestNotebook.addAnimal(animal11);
        forestNotebook.addAnimal(animal12);
        forestNotebook.addAnimal(animal13);
        forestNotebook.addPlant(plant1);
        forestNotebook.addPlant(plant2);
        forestNotebook.addPlant(plant3);
        forestNotebook.addPlant(plant4);
        forestNotebook.addPlant(plant5);
        forestNotebook.addPlant(plant6);//trying to add same plant.
        forestNotebook.addPlant(plant7);
        forestNotebook.printNotebook();
        System.out.println("*".repeat(80));
        System.out.println(forestNotebook.getAnimalCount());
        System.out.println(forestNotebook.getPlantCount());
        System.out.println("*".repeat(80));
        System.out.println(forestNotebook.getCarnivores());
        System.out.println("*".repeat(80));
        System.out.println(forestNotebook.getHerbivores());
        System.out.println("*".repeat(80));
        System.out.println(forestNotebook.getOmnivores());
        System.out.println("*".repeat(80));
        System.out.println("Sorted by Animals name");
        forestNotebook.sortAnimalsByName();
        forestNotebook.printNotebook();
        System.out.println("*".repeat(80));
        System.out.println("Sorted by Plants name");
        forestNotebook.sortPlantsByName();
        forestNotebook.printNotebook();
        System.out.println("*".repeat(80));
        System.out.println("Sorted by Plants Colour");
        forestNotebook.sortPlantsByColour();
        forestNotebook.printNotebook();
        System.out.println("*".repeat(80));
        System.out.println("Sorted by Decibel ");
        forestNotebook.sortAnimalByDecibel();




    }
}
