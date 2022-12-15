// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package L5HW;

import java.util.HashMap;
import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Ivan");
        names.add("Anton");
        names.add("Anton");
        names.add("Petr");
        names.add("Anton");
        names.add("Petr");
        HashMap<String, Integer> count = new HashMap<>();
        for (int i = 0; i < names.size(); i++) {
            int repeats = 0;
            for (int j = 0; j < names.size(); j++) {
                if (names.get(i) == names.get(j)) {
                    repeats++;
                    count.put(names.get(i), repeats);
                }
            }
        }
        System.out.println(count);
    }
}
