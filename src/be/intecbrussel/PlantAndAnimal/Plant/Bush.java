package be.intecbrussel.PlantAndAnimal.Plant;

public class Bush extends Plant {
    private LeafType leafType;
    private String fruit;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height,Colour colour) {
        super(name, height,colour);
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "name=" + getName()+
                ", leafType=" + leafType +
                ", fruit='" + fruit + '\'' +
                ", colour = "+getColour()+
                '}';
    }

}
