package be.intecbrussel.PlantAndAnimal.Plant;

public class Tree extends Plant{
    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height,Colour colour) {
        super(name, height,colour);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name=" + getName()+
                ", leafType=" + leafType +
                ", colour = "+getColour()+
                '}';
    }
}
