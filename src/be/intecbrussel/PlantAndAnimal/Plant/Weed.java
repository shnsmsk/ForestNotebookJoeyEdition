package be.intecbrussel.PlantAndAnimal.Plant;

public class Weed extends Plant{
    private double area;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height,Colour colour) {
        super(name, height,colour);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "name=" + getName()+
                ", area=" + area +
                ", colour = "+getColour()+
                '}';
    }
}
