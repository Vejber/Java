package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class showList extends ContactBook {

    public showList(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String showAll(ArrayList<Contact> allContacts) {
        ArrayList<String> showContacts = new ArrayList<>();
        for (Contact item : allContacts) { // Contact contact1{name; phone: 123, 456}
            ContactToString contact = new ContactToString(item.name, item.reach);
            String result = contact.convertWithIteration(item);
            showContacts.add(result);
        }
        String listString = String.join(", ", showContacts);
        return listString;
    }
}
