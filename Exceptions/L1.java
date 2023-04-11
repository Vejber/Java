package Exceptions;

import java.util.ArrayList;

public class L1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        arr[0] = 1;
        arr[1] = 2;
        checkArray(arr);

        Integer[] arr1 = { 1, 2, 3, 4, 5, 6 };
        Integer[] arr2 = { 1, 2, 3, 4, 5 };
        checkLength(arr1, arr2);
    }

    // Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
    // целочисленный одномерный массив.
    // Метод должен пройтись по каждому элементу и проверить что он не равен null.
    // А теперь реализуйте следующую логику:
    // Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
    // пользователя
    // Если null’ы встретились в нескольких ячейках, то идеально было бы все их
    // “подсветить”

    public static void checkArray(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                result.add(i);
            }
        }
        System.out.println("Значения null встретились в индексах массива: " + result);
    }

    // Реализуйте метод, принимающий в качестве аргументов два целочисленных
    // массива,
    // и возвращающий новый массив, каждый элемент которого равен сумме элементов
    // двух входящих массивов в той же ячейке.
    // Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static void checkLength(Integer[] arr1, Integer[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не совпадают.");
        } else {
            ArrayList<Integer> result = new ArrayList<>();
            for (int i = 0; i < arr1.length; i++) {
                result.add(arr1[i] + arr2[i]);
            }
            System.out.println(result);
        }
    }
}
