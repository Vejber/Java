package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class FindContact extends ContactBook {

    public FindContact(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String SearchContact(ArrayList<Contact> allContacts) {
        allContacts = returnContactBook();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите название контакта/ имя.");
        String userAsk = iScanner.nextLine();
        for (Contact item : allContacts) { // Contact contact1{name; phone: 123, 456}
            ContactToString contact = new ContactToString(item.name, item.reach);
            String result = contact.convertWithIteration(item);
            if (result.contains(userAsk)) {
                return result;
            }
        }
        return ("Контакт не найден.");
    }
}
