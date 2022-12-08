// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметичское этого списка.
package L3.HW;

import java.util.ArrayList;

public class task3 {
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
        int min = list.get(0);
        int max = list.get(0);
        int avg = 0;
        for (Integer o : list) {
            if (o < min) {
                min = o;
            }
            if (o > max) {
                max = o;
            }
            avg = avg + o;
        }
        avg = avg / list.size();
        System.out.println("min = " + min + ", max = " + max + ", average = " + avg + ".");
    }
}
