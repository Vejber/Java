package Laptop;

import java.util.jar.Attributes.Name;

public class Laptop {
    int ram;
    int hdVolume;
    String os;
    String color;

    @Override
    public String toString() {
        return String.format("RAM: %d; HDVolume: %d; OS: %s; Colour: %s;", ram, hdVolume, os,
                color);
    }
}