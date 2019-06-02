package Day55_Abstraction;

public abstract class Mammal extends Animal{
    
    public Mammal(String name) {
        super(name);
    }

    public abstract void produceAMilk();
    public abstract void eat();

}