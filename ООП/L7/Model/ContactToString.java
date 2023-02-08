package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;

import ООП.L7.Contact;

// String name, HashMap<String, ArrayList> contacts
public class ContactToString extends Contact {
    public ContactToString(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String convertWithIteration(Contact contacts) {
        StringBuilder ContactAsString = new StringBuilder("{");
        String name = this.name;
        HashMap<String, ArrayList<String>> thisContacts = this.reach;
        ContactAsString.append(name); // "{Pupa
        for (Object key : thisContacts.keySet()) { // phone
            ArrayList<String> arrayListString = new ArrayList<>();
            Object value = thisContacts.get(key);
            String valueString = (String) value;
            {
                arrayListString.add(valueString);
            } // 123, 456
              // thisContacts.get(key); // 123, 456
            String arrayListAsString = String.join(", ", arrayListString); // maybe problematic like this
                                                                           // maybeproblematic
            ContactAsString.append(key + "=" + arrayListAsString + ", ");
        }
        ContactAsString.delete(ContactAsString.length() - 2, ContactAsString.length()).append("}");
        return ContactAsString.toString(); // returns one contact
    }
}
