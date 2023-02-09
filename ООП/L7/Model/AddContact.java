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
        Scanner iScanner1 = new Scanner(System.in);
        System.out.printf(
                "Введите название контакта/ имя. ");
        String newName = iScanner1.nextLine();
        // iScanner1.close();
        ArrayList<String> newPhones = new ArrayList<>(); // может зациклиться если после нажатия ентер тоже счтается//
                                                         // строка

        // Scanner iScanner2 = new Scanner(System.in);

        // System.out.printf(
        // "Введите номер телефона. ");
        // String newPhone = iScanner2.nextLine();
        // newPhones.add(newPhone);
        ArrayList<String> newEmails = new ArrayList<>();
        ArrayList<String> newTgs = new ArrayList<>();
        ArrayList<String> newVks = new ArrayList<>();
        ArrayList<String> newAddresses = new ArrayList<>();
        while (iScanner1.hasNextLine()) {
            System.out.printf(
                    "Введите номер телефона или @ чтобы продолжить. ");
            String newPhone = iScanner1.nextLine();
            if (newPhone.equals("@")) {
                // Scanner iScanner3 = new Scanner(System.in);
                while (iScanner1.hasNextLine()) {
                    System.out.printf(
                            "Введите email или @ чтобы продолжить. ");
                    String newEmail = iScanner1.nextLine();
                    if (newEmail.equals("@")) {
                        while (iScanner1.hasNext()) {
                            System.out.printf(
                                    "Введите ник в телеграме или @ чтобы продолжить. ");
                            String newTg = iScanner1.nextLine();
                            if (newTg.equals("@")) {
                                while (iScanner1.hasNext()) {
                                    System.out.printf(
                                            "Введите вк или @ чтобы продолжить. ");
                                    String newVk = iScanner1.nextLine();
                                    if (newVk.equals("@")) {
                                        while (iScanner1.hasNext()) {
                                            System.out.printf(
                                                    "Введите адрес или @ чтобы продолжить. ");
                                            String newAddress = iScanner1.nextLine();
                                            if (newAddress.equals("@")) {
                                                iScanner1.close();
                                            } else {
                                                newAddresses.add(newAddress);
                                            }
                                        }
                                    } else {
                                        newVks.add(newVk);
                                    }
                                }
                            } else {
                                newTgs.add(newTg);
                            }
                        }
                    } else {
                        newEmails.add(newEmail);
                    }
                }
            } else {
                newPhones.add(newPhone);
            }
        }
        // iScanner2.close();
        iScanner1.close();

        // ArrayList<String> newEmails = new ArrayList<>();
        // Scanner iScanner3 = new Scanner(System.in);
        // while (iScanner3.hasNext()) {
        // System.out.printf(
        // "Введите email. ");
        // String newEmail = iScanner3.nextLine();
        // newEmails.add(newEmail);
        // }
        // iScanner3.close();

        // Scanner iScanner4 = new Scanner(System.in);
        // ArrayList<String> newTgs = new ArrayList<>();
        // while (iScanner4.hasNext()) {
        // System.out.printf(
        // "Введите ник в телеграме. ");
        // String newTg = iScanner4.nextLine();
        // newTgs.add(newTg);
        // }
        // iScanner4.close();

        // Scanner iScanner5 = new Scanner(System.in);
        // ArrayList<String> newVks = new ArrayList<>();
        // while (iScanner5.hasNext()) {
        // System.out.printf(
        // "Введите вк. ");
        // String newVk = iScanner5.nextLine();
        // newVks.add(newVk);
        // }
        // iScanner5.close();

        // Scanner iScanner6 = new Scanner(System.in);
        // ArrayList<String> newAddresses = new ArrayList<>();
        // while (iScanner6.hasNext()) {
        // System.out.printf(
        // "Введите адрес. ");
        // String newAddress = iScanner6.nextLine();
        // newAddresses.add(newAddress);
        // }
        // iScanner6.close();

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
