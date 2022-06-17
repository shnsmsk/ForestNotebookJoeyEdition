package be.intecbrussel.PlantAndAnimal.Plant;

public class Flower extends Plant{
    private Scent smell;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height,Colour colour) {
        super(name, height,colour);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name=" + getName()+
                " , smell=" + smell +
                ", colour = "+getColour()+
                '}';
    }
}
