package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class AddContact extends ContactBook {

    public AddContact(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String addNew(ArrayList<Contact> oldBook) {
        // ArrayList<Contact> newBook =
        oldBook = returnContactBook();
        Scanner iScanner = new Scanner(System.in);
        System.out.printf(
                "Введите название контакта/ имя. ");
        String newName = iScanner.nextLine();

        ArrayList<String> newPhones = new ArrayList<>(); // может зациклиться если после нажатия ентер тоже счтается
                                                         // строка
        while (iScanner.hasNext()) {
            System.out.printf(
                    "Введите номер телефона. ");
            String newPhone = iScanner.nextLine();
            newPhones.add(newPhone);
        }

        ArrayList<String> newEmails = new ArrayList<>();
        while (iScanner.hasNext()) {
            System.out.printf(
                    "Введите email. ");
            String newEmail = iScanner.nextLine();
            newEmails.add(newEmail);
        }

        ArrayList<String> newTgs = new ArrayList<>();
        while (iScanner.hasNext()) {
            System.out.printf(
                    "Введите ник в телеграме. ");
            String newTg = iScanner.nextLine();
            newTgs.add(newTg);
        }

        ArrayList<String> newVks = new ArrayList<>();
        while (iScanner.hasNext()) {
            System.out.printf(
                    "Введите вк. ");
            String newVk = iScanner.nextLine();
            newVks.add(newVk);
        }

        ArrayList<String> newAddresses = new ArrayList<>();
        while (iScanner.hasNext()) {
            System.out.printf(
                    "Введите адрес. ");
            String newAddress = iScanner.nextLine();
            newAddresses.add(newAddress);
        }
        iScanner.close();

        HashMap<String, ArrayList<String>> newContactHashMap = new HashMap<>();
        newContactHashMap.put("phone", newPhones);
        newContactHashMap.put("email", newEmails);
        newContactHashMap.put("tg", newTgs);
        newContactHashMap.put("vk", newVks);
        newContactHashMap.put("address", newAddresses);
        // Contact NewContact = new Contact(String name, HashMap<String,
        // ArrayList<String>> reach);
        Contact NewContact = new Contact(newName, newContactHashMap);
        // NewContact.name = newName;
        // NewContact.reach = newContactHashMap;
        oldBook.add(NewContact);
        // return oldBook;
        return ("Контакт добавлен.");
    }
}
