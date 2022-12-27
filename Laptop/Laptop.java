package Laptop;

import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class Laptop {
    String name;
    int ram;
    int hdVolume;
    String os;
    String color;

    @Override
    public String toString() {
        return String.format("RAM: %d; HDVolume: %d; OS: %s; Colour: %s;", ram, hdVolume, os,
                color);
    }

    public static Iterator<String> iterator() {
        return null;
    }
}