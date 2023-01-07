package ООП.L1;

public class HotDrink extends HotDrinksMachine {
    int t; // temprerature

    public HotDrink(String name, int volume, int t) {
        super(name, volume);
        this.t = t;
    }

    public int getTemperature() {
        return t;
    }

    @Override
    public String toString() {
        return String.format("Take your " + name + ", " + volume + "ml, " + t + " degrees.");
    }
}
