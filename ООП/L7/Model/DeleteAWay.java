package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class DeleteAWay extends ContactBook {

    public DeleteAWay(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String remove(ArrayList<Contact> oldBook) { // or String
        oldBook = returnContactBook();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите название контакта/ имя. ");
        String thisName = iScanner.nextLine();
        System.out.printf(
                "Введите способ связи, который нужно удалить. ");
        String thisWay = iScanner.nextLine();
        iScanner.close();
        for (Contact item : oldBook) { // Contact contact1{name; phone: 123, 456}
            ContactToString contact = new ContactToString(item.name, item.reach);
            String result = contact.convertWithIteration(item);
            if (result.contains(thisName)) {
                if (result.contains(thisWay)) {
                    HashMap<String, ArrayList<String>> thisContacts = this.reach;
                    for (Object key : thisContacts.keySet()) { // phone
                        Object value = thisContacts.get(key);
                        String valueString = (String) value;
                        if (valueString.equals(thisWay)) {
                            // прописать удаление
                            this.reach.remove(key, thisContacts.get(key));
                            return ("Способ связи удален.");
                        }
                    }
                } else {
                    return ("Способ не найден.");
                }
            } else {
                return ("Контакт не найден.");
            }
        }
        return ("Контакт не найден.");
    }
}
