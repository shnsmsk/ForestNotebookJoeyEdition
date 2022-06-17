package be.intecbrussel.PlantAndAnimal.Animals;

public class Carnivore extends Animal{
    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length,int decibel) {
        super(name, weight, height, length,decibel);
    }

    public double getMaxFoodSize() {
        maxFoodSize=getHeight();
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "name=" + getName()+
                ", maxFoodSize=" + maxFoodSize +
                ", decibel="+ getDecibel()+
                '}';
    }

    @Override
    public double getHeight() {
        return super.getHeight();
    }
    public void makeNoise() {
        System.out.println(getName()+" is making "+getDecibel()+" decibel noise.");
    }
}
