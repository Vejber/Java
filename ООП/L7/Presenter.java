package ООП.L7;

import java.util.ArrayList;
import java.util.HashMap;

import ООП.L7.Model.AddContact;
import ООП.L7.Model.AddWay;
import ООП.L7.Model.DeleteAWay;
import ООП.L7.Model.DeleteContact;
import ООП.L7.Model.FindContact;
import ООП.L7.Model.showList;

public class Presenter extends ContactBook {
    public Presenter(String name, HashMap<String, ArrayList<String>> reach) {
        super(name, reach);
        // TODO Auto-generated constructor stub
    }

    public static String action(String result) {
        ArrayList<Contact> allContacts = returnContactBook();
        switch (result) {
            case ("1"):
                showList show = new showList(name, reach);
                String view = show.showAll(allContacts);
                return view;
            case ("2"):
                FindContact find = new FindContact(name, reach);
                String view1 = find.SearchContact(allContacts);
                return view1;
            case ("3"):
                AddContact add = new AddContact(name, reach);
                String view2 = add.addNew(allContacts);
                return view2;
            case ("4"):
                DeleteContact deleteContact = new DeleteContact(name, reach);
                String view3 = deleteContact.deleteContact(allContacts);
                return view3;
            case ("5"):
                AddWay addWay = new AddWay(name, reach);
                String view4 = addWay.addWay(allContacts);
                return view4;
            case ("6"):
                DeleteAWay deleteWay = new DeleteAWay(name, reach);
                String view5 = deleteWay.remove(allContacts);
                return view5;
        }
        return ("Попробуйте снова.");
    }
}
