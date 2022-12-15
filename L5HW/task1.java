// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.

package L5HW;

import java.util.HashMap;
import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<String> phones = new LinkedList<>();
        phones.add("123");
        phones.add("456");
        LinkedList<String> phones1 = new LinkedList<>();
        phones1.add("876");
        phones1.add("0987");
        HashMap<String, LinkedList<String>> book = new HashMap<>();
        book.put("Ivan", phones);
        book.put("Petr", phones1);
        System.out.println(book);
    }
}
