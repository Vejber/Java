package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;

// fignya,nado<String,ArrayList>

public class HashMapToString {
    public String convertWithIteration(HashMap<String, ArrayList<String>> map) {
        StringBuilder mapAsString = new StringBuilder("{");
        for (String key : map.keySet()) {
            ArrayList<String> arrayListString = map.get(key);
            String arrayListAsString = String.join(", ", arrayListString);
            mapAsString.append(key + "=" + arrayListAsString + ", ");
        }
        mapAsString.delete(mapAsString.length() - 2, mapAsString.length()).append("}");
        return mapAsString.toString();
    }
}
