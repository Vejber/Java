package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;

import ООП.L7.Contact;

public class DeleteContact extends FindContact {

    public DeleteContact(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String deleteContact(ArrayList<Contact> oldBook) {
        oldBook = returnContactBook();
        String thisName = SearchContact(oldBook);
        if (!thisName.contains("Контакт не найден.")) {
            for (Contact contact : oldBook) {
                if (thisName.contains(contact.name)) {
                    oldBook.remove(contact);
                    return ("Контакт удален.");
                }
            }
        }
        return thisName;
    }
}
