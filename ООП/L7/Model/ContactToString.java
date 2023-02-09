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
            String arrayListAsString = String.join(", ", thisContacts.get(key));
            ContactAsString.append(key + "=" + arrayListAsString + ", ");
        }
        ContactAsString.delete(ContactAsString.length() - 2, ContactAsString.length()).append("}");
        return ContactAsString.toString(); // returns one contact
    }
}
