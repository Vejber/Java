package ООП.L7.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import ООП.L7.Contact;
import ООП.L7.ContactBook;

public class AddWay extends FindContact {

    public AddWay(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public String addWay(ArrayList<Contact> oldBook) { // or String
        oldBook = returnContactBook();
        String thisName = SearchContact(oldBook);
        if (!thisName.equals("Контакт не найден.")) {
            // HashMap<String, ArrayList<String>> addNewWay = new HashMap<>();
            ArrayList<String> newNumbersWay = new ArrayList<>();
            for (Object Contact : oldBook) {
                if (name.equals(thisName)) {
                    Scanner iScanner = new Scanner(System.in);
                    System.out.printf("Введите название нового способа связи. ");
                    String newWay = iScanner.nextLine();
                    while (iScanner.hasNextLine()) {
                        System.out.printf("Введите значение нового способа свзязи. ");
                        String newNumbers = iScanner.nextLine();
                        newNumbersWay.add(newNumbers);
                    }
                    // iScanner.close();
                    reach.put(newWay, newNumbersWay);
                }
            }
            return ("Способ связи добавлен.");
        } else {
            return thisName;
        }
    }
}
