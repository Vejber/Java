package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class DeleteContact extends FindContact {

    public DeleteContact(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String deleteContact(ArrayList<Contact> oldBook) { // or String
        oldBook = returnContactBook();
        String thisName = SearchContact(oldBook);
        if (!thisName.equals("Контакт не найден.")) {
            for (Object Contact : oldBook) {
                if (name.equals(thisName)) {
                    oldBook.remove(Contact);
                    return ("Контакт удален.");
                }
            }
        }
        return thisName;
    }
}
