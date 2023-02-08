package ООП.L7;

import java.util.ArrayList;
import java.util.HashMap;

public class ContactBook extends Contact {

    public ContactBook(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public static ArrayList<Contact> returnContactBook() {

        //////////////// contact1
        // his name
        String contact1Name = "Lupa";

        // one of his many contacts
        String contact1Phone = "phone";
        // his many phone numbers
        ArrayList<String> contact1PhoneNumbers = new ArrayList<>();
        {
            contact1PhoneNumbers.add("12345");
            contact1PhoneNumbers.add("5678");
        }

        // all of his contacts
        HashMap<String, ArrayList<String>> contact1Contacts = new HashMap<>();
        {
            contact1Contacts.put(contact1Phone, contact1PhoneNumbers);
        }

        // the contact itself alltogether
        Contact contact1 = new Contact(contact1Name, contact1Contacts);
        ////////////////////////// the end of contact1

        //////////////// contact2
        // his name
        String contact2Name = "Pupa";

        // one of his many contacts
        String contact2Phone = "phone";
        String contact2Vk = "vk";
        String contact2Address = "address";
        String contact2Email = "email";
        String contact2Tg = "tg";

        // his many phone numbers
        ArrayList<String> contact2PhoneNumbers = new ArrayList<>();
        {
            contact2PhoneNumbers.add("83747");
            contact2PhoneNumbers.add("29238");
        }

        ArrayList<String> contact2Vks = new ArrayList<>();
        {
            contact2Vks.add("I'm Pupa");
            contact2Vks.add("Pupa Lupov");
        }

        ArrayList<String> contact2Addresses = new ArrayList<>();
        {
            contact2Addresses.add("Pupa st.1");
            contact2Addresses.add("Pupa st.2");
        }

        ArrayList<String> contact2Emails = new ArrayList<>();
        {
            contact2Emails.add("@1Pupa");
            contact2Emails.add("@2Pupa");
        }

        ArrayList<String> contact2Tgs = new ArrayList<>();
        {
            contact2Tgs.add("@pupu");
            contact2Tgs.add("@pipi");
        }

        // all of his contacts
        HashMap<String, ArrayList<String>> contact2Contacts = new HashMap<>();
        {
            contact2Contacts.put(contact2Phone, contact2PhoneNumbers);
            contact2Contacts.put(contact2Vk, contact2Vks);
            contact2Contacts.put(contact2Address, contact2Addresses);
            contact2Contacts.put(contact2Email, contact2Emails);
            contact2Contacts.put(contact2Tg, contact2Tgs);
        }

        // the contact itself alltogether (name + all contacts)
        Contact contact2 = new Contact(contact2Name, contact2Contacts);
        ////////////////////////// the end of contact2

        ArrayList<Contact> allContacts = new ArrayList<>(); // the actual contactbook
        {
            allContacts.add(contact1);
            allContacts.add(contact2);
        }
        return allContacts;
    }
}
