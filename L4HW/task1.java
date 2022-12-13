// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package L4HW;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        returnll(ll, ll1);
    }

    public static void returnll(LinkedList<Integer> ll, LinkedList<Integer> ll1) {
        for (int j = ll.size() - 1; j >= 0; j--) {
            int n = ll.get(j);
            ll1.add(n);
        }
        System.out.println(ll1);
    }
}
