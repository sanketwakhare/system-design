package designbird.v2;


/**
 * v2 design of class Bird
 *
 * create FlyableBird and nonFlyableBird classes
 * <p>
 * <b>Problems :</b>
 * what if some birds can eat and some cannot eat ?
 * what if some birds can make sound and some cannot make sound ?
 * <p>
 * you will end up creating multiple classes
 * e.g. below 8 classes are required to support the behaviour. this problem is called <b>class explosion</b>
 * FlyableEatableSoundMakerBird
 * FlyableEatableNonSoundMakerBird
 * FlyableNonEatableSoundMakerBird
 * FlyableNonEatableNonSoundMakerBird
 * NonFlyableEatableSoundMakerBird
 * NonFlyableEatableNonSoundMakerBird
 * NonFlyableNonEatableSoundMakerBird
 * NonFlyableNonEatableNonSoundMakerBird
 */
public abstract class Bird {

    private final String type;
    private int weight;
    private String color;
    private int size;
    private String beakType;

    public Bird(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }
}