package ООП.L7;

import java.util.ArrayList;
import java.util.HashMap;

public class Contact {
    public String name;
    public HashMap<String, ArrayList<String>> reach; // tg: (@1, @2)

    public Contact(String name, HashMap<String, ArrayList<String>> reach) {
        this.name = name;
        this.reach = reach;
    }
}
