package decorator.icecream.scoop;

import decorator.icecream.ICone;

public class MangoScoop implements ICone {

    ICone baseCone;

    public MangoScoop(ICone baseCone) {
        this.baseCone = baseCone;
    }

    @Override
    public double getCost() {
        return 60;
    }

    @Override
    public String getConstituents() {
        return baseCone.getConstituents() + "-" + "MangoScoop";
    }
}
