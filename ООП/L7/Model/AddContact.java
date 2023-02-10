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
        oldBook = returnContactBook();
        Boolean goOn = true;
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf(
                "Введите название контакта/ имя. ");
        String newName = iScanner1.nextLine();
        ArrayList<String> newPhones = new ArrayList<>();
        ArrayList<String> newEmails = new ArrayList<>();
        ArrayList<String> newTgs = new ArrayList<>();
        ArrayList<String> newVks = new ArrayList<>();
        ArrayList<String> newAddresses = new ArrayList<>();
        while (goOn) {
            System.out.printf(
                    "Введите номер телефона или @ чтобы продолжить. ");
            String newPhone = iScanner1.nextLine();
            if (!newPhone.equals("@")) {
                newPhones.add(newPhone);
            } else {
                while (goOn) {
                    System.out.printf(
                            "Введите email или @ чтобы продолжить. ");
                    String newEmail = iScanner1.nextLine();
                    if (!newEmail.equals("@")) {
                        newEmails.add(newEmail);
                    } else {
                        while (goOn) {
                            System.out.printf(
                                    "Введите ник в телеграме или @ чтобы продолжить. ");
                            String newTg = iScanner1.nextLine();
                            if (!newTg.equals("@")) {
                                newTgs.add(newTg);
                            } else {
                                while (goOn) {
                                    System.out.printf(
                                            "Введите вк или @ чтобы продолжить. ");
                                    String newVk = iScanner1.nextLine();
                                    if (!newVk.equals("@")) {
                                        newVks.add(newVk);
                                    } else {
                                        while (goOn) {
                                            System.out.printf(
                                                    "Введите адрес или @ чтобы продолжить. ");
                                            String newAddress = iScanner1.nextLine();
                                            if (!newAddress.equals("@")) {
                                                newAddresses.add(newAddress);
                                            } else {
                                                goOn = false;
                                                iScanner1.close();
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        HashMap<String, ArrayList<String>> newContactHashMap = new HashMap<>();
        newContactHashMap.put("phone", newPhones);
        newContactHashMap.put("email", newEmails);
        newContactHashMap.put("tg", newTgs);
        newContactHashMap.put("vk", newVks);
        newContactHashMap.put("address", newAddresses);
        Contact NewContact = new Contact(newName, newContactHashMap);
        oldBook.add(NewContact);
        return ("Контакт добавлен.");
    }
}