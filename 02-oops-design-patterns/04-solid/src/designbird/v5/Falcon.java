package designbird.v5;

public class Falcon extends Bird implements Flyable , Eatable, SoundMaker{

    FlyingBehavior flyingBehavior;

    public Falcon(FlyingBehavior flyingBehavior) {
        super("falcon");
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        System.out.print(getType() + " ");
        flyingBehavior.makeFly();
    }

    @Override
    public void makeSound() {
        System.out.println("kak-kak-kak");
    }
}
