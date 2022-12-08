// Пусть дан произвольный список целых чисел. Удалить из него чётные числа
package L3.HW;

import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
