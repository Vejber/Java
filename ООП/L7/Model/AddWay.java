package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;

public class AddWay extends FindContact {

    public AddWay(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String addWay(ArrayList<Contact> oldBook) {
        oldBook = returnContactBook();
        Boolean goOn = true;
        String thisName = SearchContact(oldBook);
        if (!thisName.contains("Контакт не найден.")) {
            for (Contact item : oldBook) { // Contact contact1{name; phone: 123, 456}
                ContactToString contact = new ContactToString(item.name, item.reach);
                String result = contact.convertWithIteration(item);
                ArrayList<String> newNumbersWay = new ArrayList<>();
                if (result.contains(thisName)) {
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите название нового способа связи. ");
                    String newWay = iScanner.nextLine();
                    while (goOn) {
                        System.out.printf("Введите значение нового способа свзязи или @ чтобы продолжить. ");
                        String newNumbers = iScanner.nextLine();
                        if (!newNumbers.equals("@")) {
                            newNumbersWay.add(newNumbers);
                        } else {
                            iScanner.close();
                            goOn = false;
                        }
                    }
                    item.reach.put(newWay, newNumbersWay);
                }
            }
            return ("Способ связи добавлен.");
        } else {
            return thisName;
        }
    }
}
